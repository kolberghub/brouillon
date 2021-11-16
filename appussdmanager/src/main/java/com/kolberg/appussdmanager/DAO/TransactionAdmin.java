package com.kolberg.appussdmanager.DAO;

public class TransactionAdmin {

   String id, admin, number, numero_dest, amount, currencie, code_operation, date_operation, statut;

    public TransactionAdmin() {
        clear();
    }

    public TransactionAdmin(String id, String admin, String number, String numero_dest, String amount, String currencie,
                            String code_operation, String date_operation, String statut) {
        this.id = id;
        this.admin = admin;
        this.number = number;
        this.numero_dest = numero_dest;
        this.amount = amount;
        this.currencie = currencie;
        this.code_operation = code_operation;
        this.date_operation = date_operation;
        this.statut = statut;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumero_dest() {
        return numero_dest;
    }

    public void setNumero_dest(String numero_dest) {
        this.numero_dest = numero_dest;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrencie() {
        return currencie;
    }

    public void setCurrencie(String currencie) {
        this.currencie = currencie;
    }

    public String getCode_operation() {
        return code_operation;
    }

    public void setCode_operation(String code_operation) {
        this.code_operation = code_operation;
    }

    public String getDate_operation() {
        return date_operation;
    }

    public void setDate_operation(String date_operation) {
        this.date_operation = date_operation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    private void clear(){
        this.id = "";
        this.admin= "";
        this.number= "";
        this.numero_dest= "";
        this.amount= "";
        this.currencie= "";
        this.code_operation= "";
        this.date_operation= "";
        this.statut= "";
    }

    @Override
    public String toString() {
        return "TransactionAdmin{" +
                "id='" + id + '\'' +
                ", admin='" + admin + '\'' +
                ", number='" + number + '\'' +
                ", numero_dest='" + numero_dest + '\'' +
                ", amount='" + amount + '\'' +
                ", currencie='" + currencie + '\'' +
                ", code_operation='" + code_operation + '\'' +
                ", date_operation='" + date_operation + '\'' +
                ", statut='" + statut + '\'' +
                '}';
    }
}
