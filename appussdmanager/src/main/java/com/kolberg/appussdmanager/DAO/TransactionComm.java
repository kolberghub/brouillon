package com.kolberg.appussdmanager.DAO;

public class TransactionComm {

    String id, id_user, pays, amount, wanting_currencie, wanting_adresse, wanting_statut, wanting_type, operation_date;

    public TransactionComm() {
        clear();
    }

    public TransactionComm(String id, String id_user, String pays, String amount, String wanting_currencie,
                           String wanting_adresse, String wanting_statut, String wanting_type, String operation_date) {
        this.id = id;
        this.id_user = id_user;
        this.pays = pays;
        this.amount = amount;
        this.wanting_currencie = wanting_currencie;
        this.wanting_adresse = wanting_adresse;
        this.wanting_statut = wanting_statut;
        this.wanting_type = wanting_type;
        this.operation_date = operation_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getWanting_currencie() {
        return wanting_currencie;
    }

    public void setWanting_currencie(String wanting_currencie) {
        this.wanting_currencie = wanting_currencie;
    }

    public String getWanting_adresse() {
        return wanting_adresse;
    }

    public void setWanting_adresse(String wanting_adresse) {
        this.wanting_adresse = wanting_adresse;
    }

    public String getWanting_statut() {
        return wanting_statut;
    }

    public void setWanting_statut(String wanting_statut) {
        this.wanting_statut = wanting_statut;
    }

    public String getWanting_type() {
        return wanting_type;
    }

    public void setWanting_type(String wanting_type) {
        this.wanting_type = wanting_type;
    }

    public String getOperation_date() {
        return operation_date;
    }

    public void setOperation_date(String operation_date) {
        this.operation_date = operation_date;
    }

    private void clear(){
        this.id = "";
        this.id_user = "";
        this.pays= "";
        this.amount= "";
        this.wanting_currencie= "";
        this.wanting_adresse= "";
        this.wanting_statut= "";
        this.wanting_type= "";
        this.operation_date= "";
    }

    @Override
    public String toString() {
        return "TransactionComm{" +
                "id='" + id + '\'' +
                ", id_user='" + id_user + '\'' +
                ", pays='" + pays + '\'' +
                ", amount='" + amount + '\'' +
                ", wanting_currencie='" + wanting_currencie + '\'' +
                ", wanting_adresse='" + wanting_adresse + '\'' +
                ", wanting_statut='" + wanting_statut + '\'' +
                ", wanting_type='" + wanting_type + '\'' +
                ", operation_date='" + operation_date + '\'' +
                '}';
    }


}
