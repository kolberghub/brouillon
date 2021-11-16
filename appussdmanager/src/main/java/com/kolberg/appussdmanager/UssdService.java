 package com.kolberg.appussdmanager;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;


import com.kolberg.appussdmanager.DAO.Ligne_Operation;
import com.kolberg.appussdmanager.DAO.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

 public class UssdService extends AccessibilityService {

     public static String ip_domain,mode,SIM,CODE_SIM_R,SERVER_CODDE;
     public static int who;
     public static Transaction transaction;
     public static ArrayList<Ligne_Operation> ligne_operations_paiements_sim_r;

     private String update_transaction = "https://"+ip_domain+"/"+mode+"/bdd/transaction_status.php";


     @Override
     public void onAccessibilityEvent(AccessibilityEvent event) {

         if (event.getClassName().equals("android.app.AlertDialog")) {

             AccessibilityNodeInfo nodeInfo = getRootInActiveWindow();
             AccessibilityNodeInfo nodeInput = nodeInfo.findFocus(AccessibilityNodeInfo.FOCUS_INPUT);
             Bundle bundle = new Bundle();

             switch (who) {
                 case 0: // transactions echangeur
                     Operation_Transaction_Echangeur(event, bundle, nodeInfo, nodeInput);
                     break;
             }

         }
     }

     private void Operation_Transaction_Echangeur(AccessibilityEvent event, Bundle bundle, AccessibilityNodeInfo nodeInfo, AccessibilityNodeInfo nodeInput) {
         if (transaction.getWantingCurrencie().equals(SIM)) {
             String input = "";


             for(Ligne_Operation lo : ligne_operations_paiements_sim_r){

                 if(event.getText().toString().toLowerCase().contains(lo.getOutput_1().toLowerCase()) || event.getText().toString().toLowerCase().contains(lo.getOutput_2().toLowerCase())){

                     switch (lo.getInput()){
                         case "NUMBER":
                             input = transaction.getWanting_adresse();
                             break;
                         case "AMOUNT":
                             input = transaction.getWantingAmont();
                             break;
                         case "CODE":
                             input = CODE_SIM_R;
                             break;
                         default:
                             input = lo.getInput();
                             break;
                     }

                     if(lo.getIsFinal().equals("0")) {
                         bundle.clear();
                         bundle.putCharSequence(AccessibilityNodeInfo.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE, input);
                         nodeInput.performAction(AccessibilityNodeInfo.ACTION_SET_TEXT, bundle);
                         nodeInput.refresh();
                     }

                     if(input.equals(CODE_SIM_R)){
                         List<AccessibilityNodeInfo> list = nodeInfo.findAccessibilityNodeInfosByText(lo.getAction());
                         for (AccessibilityNodeInfo node : list) {
                             node.performAction(AccessibilityNodeInfo.ACTION_CLICK);
                         }

                     }else {
                         //Validation
                         List<AccessibilityNodeInfo> list = nodeInfo.findAccessibilityNodeInfosByText(lo.getAction());
                         for (AccessibilityNodeInfo node : list) {
                             node.performAction(AccessibilityNodeInfo.ACTION_CLICK);
                             break;
                         }
                     }

                     switch (lo.getIsFinal()){
                         case "0":
                             break;
                         case "1":
                             updateTransactionStatus("retrait");
                             //who = -1;
                             //op = false;

                             break;
                         case "2":
                             updateTransactionStatusError("WRONG_NUMBER");
                             break;
                         case "3":
                             updateTransactionStatusError("NETWORK_ERROR");
                             break;
                         default:
                             updateTransactionStatusError("ERROR");
                             break;
                     }

                     break; // out of Ligne_Operation lo loop
                 }

             }

             // closing by default af
             List<AccessibilityNodeInfo> list = nodeInfo.findAccessibilityNodeInfosByText("OK");
             for (AccessibilityNodeInfo node : list) {
                 node.performAction(AccessibilityNodeInfo.ACTION_CLICK);
                 break;
             }

             list = nodeInfo.findAccessibilityNodeInfosByText("ANNULER");
             for (AccessibilityNodeInfo node : list) {
                 node.performAction(AccessibilityNodeInfo.ACTION_CLICK);
             }

         }
     }


     @Override
     public void onInterrupt() {
     }

     @Override
     protected void onServiceConnected() {
         super.onServiceConnected();

         AccessibilityServiceInfo info = new AccessibilityServiceInfo();
         info.flags = AccessibilityServiceInfo.DEFAULT;
         info.packageNames = new String[]{"com.android.phone"};
         info.eventTypes = AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED;
         info.feedbackType = AccessibilityServiceInfo.FEEDBACK_GENERIC;
         setServiceInfo(info);

     }

     //UPDATE SUCCES TRANSACTIONS STATUS

     private void updateTransactionStatus(String dir) {

         class DataBaseConnexion extends AsyncTask<Void, Void, String> {
             String dir_;

             public DataBaseConnexion(String dir) {
                 this.dir_ = dir;
             }

             @Override
             protected void onPreExecute() {
                 super.onPreExecute();

             }


             @Override
             protected String doInBackground(Void... params) {
                 HashMap<String, String> formulaire = new HashMap<>();

                 if (dir_.equalsIgnoreCase("depot")) {
                     formulaire.put("id", transaction.getTrId());
                     formulaire.put("type", "having_statut");
                     formulaire.put("status", "CONFIRMED");
                     formulaire.put("server_code", SERVER_CODDE);
                 } else {
                     formulaire.put("id", transaction.getTrId());
                     formulaire.put("type", "wanting_statut");
                     formulaire.put("status", "CONFIRMED");
                     formulaire.put("server_code", SERVER_CODDE);
                 }

                 RequestHandler rh = new RequestHandler();
                 String result = rh.sendPostRequest(update_transaction, formulaire);
                 return result;
             }

             @Override
             protected void onPostExecute(String o) {
                 super.onPostExecute(o);

             }
         }
         DataBaseConnexion dataBaseConnexion = new DataBaseConnexion(dir);
         dataBaseConnexion.execute();
     }


     //UPDATE ERROR TRANSACTIONS STATUS
     private void updateTransactionStatusError(String status) {

         class DataBaseConnexion extends AsyncTask<Void, Void, String> {
             String status_;

             public DataBaseConnexion(String dir) {
                 this.status_ = dir;
             }

             @Override
             protected void onPreExecute() {
                 super.onPreExecute();

             }


             @Override
             protected String doInBackground(Void... params) {
                 HashMap<String, String> formulaire = new HashMap<>();

                 formulaire.put("id", transaction.getTrId());
                 formulaire.put("type", "wanting_statut");
                 formulaire.put("status", status_);

                 RequestHandler rh = new RequestHandler();
                 String result = rh.sendPostRequest(update_transaction, formulaire);
                 return result;
             }

             @Override
             protected void onPostExecute(String o) {
                 super.onPostExecute(o);
                 if (o.equals("1")) {
                     // seul condition pour continuer
                 } else {

                 }

             }
         }
         DataBaseConnexion dataBaseConnexion = new DataBaseConnexion(status);
         dataBaseConnexion.execute();
     }



 }
