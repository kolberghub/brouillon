package com.kolberg.appussdmanager.DAO;

public class TransactionOpServer {

    String id, code_server, pays, cmd, date_exec, code_operation, wanting_currencie, wanting_amount,
            wanting_adresse, operation_statut, operation_date;
    int slot;

    public TransactionOpServer() {
        clear();
    }

    public TransactionOpServer(String id, String code_server,int slot, String pays, String cmd, String date_exec,
                               String code_operation, String wanting_currencie, String wanting_amount, String wanting_adresse,
                               String operation_statut, String operation_date) {
        this.id = id;
        this.code_server = code_server;
        this.slot = slot;
        this.pays = pays;
        this.cmd = cmd;
        this.date_exec = date_exec;
        this.code_operation = code_operation;
        this.wanting_currencie = wanting_currencie;
        this.wanting_amount = wanting_amount;
        this.wanting_adresse = wanting_adresse;
        this.operation_statut = operation_statut;
        this.operation_date = operation_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode_server() {
        return code_server;
    }

    public void setCode_server(String code_server) {
        this.code_server = code_server;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public String getDate_exec() {
        return date_exec;
    }

    public void setDate_exec(String date_exec) {
        this.date_exec = date_exec;
    }

    public String getCode_operation() {
        return code_operation;
    }

    public void setCode_operation(String code_operation) {
        this.code_operation = code_operation;
    }

    public String getWanting_currencie() {
        return wanting_currencie;
    }

    public void setWanting_currencie(String wanting_currencie) {
        this.wanting_currencie = wanting_currencie;
    }

    public String getWanting_amount() {
        return wanting_amount;
    }

    public void setWanting_amount(String wanting_amount) {
        this.wanting_amount = wanting_amount;
    }

    public String getWanting_adresse() {
        return wanting_adresse;
    }

    public void setWanting_adresse(String wanting_adresse) {
        this.wanting_adresse = wanting_adresse;
    }

    public String getOperation_statut() {
        return operation_statut;
    }

    public void setOperation_statut(String operation_statut) {
        this.operation_statut = operation_statut;
    }

    public String getOperation_date() {
        return operation_date;
    }

    public void setOperation_date(String operation_date) {
        this.operation_date = operation_date;
    }

    private void clear(){
        id = "";
        code_server= "";
        pays= "";
        cmd= "";
        date_exec= "";
        code_operation= "";
        wanting_currencie= "";
        wanting_amount= "";
        wanting_adresse= "";
        operation_statut= "";
        operation_date= "";
    }

    @Override
    public String toString() {
        return "TransactionOpServer{" +
                "id='" + id + '\'' +
                ", code_server='" + code_server + '\'' +
                ", pays='" + pays + '\'' +
                ", cmd='" + cmd + '\'' +
                ", date_exec='" + date_exec + '\'' +
                ", code_operation='" + code_operation + '\'' +
                ", wanting_currencie='" + wanting_currencie + '\'' +
                ", wanting_amount='" + wanting_amount + '\'' +
                ", wanting_adresse='" + wanting_adresse + '\'' +
                ", operation_statut='" + operation_statut + '\'' +
                ", operation_date='" + operation_date + '\'' +
                ", slot=" + slot +
                '}';
    }
}
