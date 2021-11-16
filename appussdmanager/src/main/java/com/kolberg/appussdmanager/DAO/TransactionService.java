package com.kolberg.appussdmanager.DAO;

public class TransactionService {

    String id, source, pays, wanting_service_sim, lib_service, service_code, service_amount,
            service_adresse, having_currencie, having_amount, having_adresse, having_statut,
            having_type, statut_operation, operation_code, operation_date, id_user, id_parrain, etoile, comment;

    public TransactionService() {
        clear();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getWanting_service_sim() {
        return wanting_service_sim;
    }

    public void setWanting_service_sim(String wanting_service_sim) {
        this.wanting_service_sim = wanting_service_sim;
    }

    public String getLib_service() {
        return lib_service;
    }

    public void setLib_service(String lib_service) {
        this.lib_service = lib_service;
    }

    public String getService_code() {
        return service_code;
    }

    public void setService_code(String service_code) {
        this.service_code = service_code;
    }

    public String getService_amount() {
        return service_amount;
    }

    public void setService_amount(String service_amount) {
        this.service_amount = service_amount;
    }

    public String getService_adresse() {
        return service_adresse;
    }

    public void setService_adresse(String service_adresse) {
        this.service_adresse = service_adresse;
    }

    public String getHaving_currencie() {
        return having_currencie;
    }

    public void setHaving_currencie(String having_currencie) {
        this.having_currencie = having_currencie;
    }

    public String getHaving_amount() {
        return having_amount;
    }

    public void setHaving_amount(String having_amount) {
        this.having_amount = having_amount;
    }

    public String getHaving_adresse() {
        return having_adresse;
    }

    public void setHaving_adresse(String having_adresse) {
        this.having_adresse = having_adresse;
    }

    public String getHaving_statut() {
        return having_statut;
    }

    public void setHaving_statut(String having_statut) {
        this.having_statut = having_statut;
    }

    public String getHaving_type() {
        return having_type;
    }

    public void setHaving_type(String having_type) {
        this.having_type = having_type;
    }

    public String getStatut_operation() {
        return statut_operation;
    }

    public void setStatut_operation(String statut_operation) {
        this.statut_operation = statut_operation;
    }

    public String getOperation_code() {
        return operation_code;
    }

    public void setOperation_code(String operation_code) {
        this.operation_code = operation_code;
    }

    public String getOperation_date() {
        return operation_date;
    }

    public void setOperation_date(String operation_date) {
        this.operation_date = operation_date;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_parrain() {
        return id_parrain;
    }

    public void setId_parrain(String id_parrain) {
        this.id_parrain = id_parrain;
    }

    public String getEtoile() {
        return etoile;
    }

    public void setEtoile(String etoile) {
        this.etoile = etoile;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    private void clear(){
        id = "";
        source= "";
        pays= "";
        wanting_service_sim= "";
        lib_service= "";
        service_code= "";
        service_amount= "";
        service_adresse= "";
        having_currencie= "";
        having_amount= "";
        having_adresse= "";
        having_statut= "";
        having_type= "";
        statut_operation= "";
        operation_code= "";
        operation_date= "";
        id_user= "";
        id_parrain= "";
        etoile= "";
        comment = "";
    }

    @Override
    public String toString() {
        return "TransactionService{" +
                "id='" + id + '\'' +
                ", source='" + source + '\'' +
                ", pays='" + pays + '\'' +
                ", wanting_service_sim='" + wanting_service_sim + '\'' +
                ", lib_service='" + lib_service + '\'' +
                ", service_code='" + service_code + '\'' +
                ", service_amount='" + service_amount + '\'' +
                ", service_adresse='" + service_adresse + '\'' +
                ", having_currencie='" + having_currencie + '\'' +
                ", having_amount='" + having_amount + '\'' +
                ", having_adresse='" + having_adresse + '\'' +
                ", having_statut='" + having_statut + '\'' +
                ", having_type='" + having_type + '\'' +
                ", statut_operation='" + statut_operation + '\'' +
                ", operation_code='" + operation_code + '\'' +
                ", operation_date='" + operation_date + '\'' +
                ", id_user='" + id_user + '\'' +
                ", id_parrain='" + id_parrain + '\'' +
                ", etoile='" + etoile + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
