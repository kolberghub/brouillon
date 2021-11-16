package com.kolberg.appussdmanager.DAO;

public class BLACKLIST {

    String id,currencie,account,msg;

    public BLACKLIST() {
    }

    public BLACKLIST(String id, String currencie, String account, String msg) {
        this.id = id;
        this.currencie = currencie;
        this.account = account;
        this.msg = msg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrencie() {
        return currencie;
    }

    public void setCurrencie(String currencie) {
        this.currencie = currencie;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
