package com.kolberg.appussdmanager.DAO;

public class Transaction {

    private String trId;
    private String src;

    private String havingCurrencie;
    private String havingAmont;
    private String havingtype;
    private String having_adresse;
    private String having_statut;
    private String havingCryptoNetwork;
    private String havingCryptoPrice;

    private String wantingCurrencie;
    private String wantingAmont;
    private String wantingtype;
    private String wanting_adresse;
    private String wanting_statut;

    private String dates;
    private String operation_code;
    private String id_user;
    private String id_parrain;
    private String pays;
    private String etoile;
    private String comment;

    public Transaction() {
        clear();
    }



    public Transaction(String trId, String src, String havingCurrencie, String havingAmont, String havingtype,
                       String having_adresse, String having_statut,String wantingCurrencie, String wantingAmont, String havingCryptoNetwork, String havingCryptoPrice,
                       String wantingtype, String wanting_adresse, String wanting_statut, String dates, String operation_code,
                       String id_user, String id_parrain, String pays, String etoile, String comment) {
        this.trId = trId;
        this.src = src;
        this.havingCurrencie = havingCurrencie;
        this.havingAmont = havingAmont;
        this.havingtype = havingtype;
        this.having_adresse = having_adresse;
        this.having_statut = having_statut;
        this.havingCryptoNetwork = havingCryptoNetwork;
        this.havingCryptoPrice = havingCryptoPrice;
        this.wantingCurrencie = wantingCurrencie;
        this.wantingAmont = wantingAmont;
        this.wantingtype = wantingtype;
        this.wanting_adresse = wanting_adresse;
        this.wanting_statut = wanting_statut;
        this.dates = dates;
        this.operation_code = operation_code;
        this.id_user = id_user;
        this.id_parrain = id_parrain;
        this.pays = pays;
        this.etoile = etoile;
        this.comment = comment;
    }

    private void clear(){
        this.trId = "";
        this.src = "";
        this.havingCurrencie = "";
        this.havingAmont = "";
        this.havingtype = "";
        this.having_adresse = "";
        this.having_statut = "";
        this.havingCryptoNetwork = "";
        this.havingCryptoPrice = "";
        this.wantingCurrencie = "";
        this.wantingAmont = "";
        this.wantingtype = "";
        this.wanting_adresse = "";
        this.wanting_statut = "";
        this.dates = "";
        this.operation_code = "";
        this.id_user = "";
        this.id_parrain = "";
        this.pays = "";
        this.etoile = "";
        this.comment = "";
    }

    public String getTrId() {
        return trId;
    }

    public void setTrId(String trId) {
        this.trId = trId;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getHavingCurrencie() {
        return havingCurrencie;
    }

    public void setHavingCurrencie(String havingCurrencie) {
        this.havingCurrencie = havingCurrencie;
    }

    public String getHavingAmont() {
        return havingAmont;
    }

    public void setHavingAmont(String havingAmont) {
        this.havingAmont = havingAmont;
    }

    public String getHavingtype() {
        return havingtype;
    }

    public void setHavingtype(String havingtype) {
        this.havingtype = havingtype;
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

    public String getHavingCryptoNetwork() {
        return havingCryptoNetwork;
    }

    public void setHavingCryptoNetwork(String havingCryptoNetwork) {
        this.havingCryptoNetwork = havingCryptoNetwork;
    }

    public String getHavingCryptoPrice() {
        return havingCryptoPrice;
    }

    public void setHavingCryptoPrice(String havingCryptoPrice) {
        this.havingCryptoPrice = havingCryptoPrice;
    }

    public String getWantingCurrencie() {
        return wantingCurrencie;
    }

    public void setWantingCurrencie(String wantingCurrencie) {
        this.wantingCurrencie = wantingCurrencie;
    }

    public String getWantingAmont() {
        return wantingAmont;
    }

    public void setWantingAmont(String wantingAmont) {
        this.wantingAmont = wantingAmont;
    }

    public String getWantingtype() {
        return wantingtype;
    }

    public void setWantingtype(String wantingtype) {
        this.wantingtype = wantingtype;
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

    public String getDates() {
        return dates;
    }

    public void setDates(String dates) {
        this.dates = dates;
    }

    public String getOperation_code() {
        return operation_code;
    }

    public void setOperation_code(String operation_code) {
        this.operation_code = operation_code;
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

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
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

    @Override
    public String toString() {
        return "Transaction{" +
                "trId='" + trId + '\'' +
                ", src='" + src + '\'' +
                ", havingCurrencie='" + havingCurrencie + '\'' +
                ", havingAmont='" + havingAmont + '\'' +
                ", havingtype='" + havingtype + '\'' +
                ", having_adresse='" + having_adresse + '\'' +
                ", having_statut='" + having_statut + '\'' +
                ", wantingCurrencie='" + wantingCurrencie + '\'' +
                ", wantingAmont='" + wantingAmont + '\'' +
                ", wantingtype='" + wantingtype + '\'' +
                ", wanting_adresse='" + wanting_adresse + '\'' +
                ", wanting_statut='" + wanting_statut + '\'' +
                ", dates='" + dates + '\'' +
                ", operation_code='" + operation_code + '\'' +
                ", id_user='" + id_user + '\'' +
                ", id_parrain='" + id_parrain + '\'' +
                ", pays='" + pays + '\'' +
                ", etoile='" + etoile + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
