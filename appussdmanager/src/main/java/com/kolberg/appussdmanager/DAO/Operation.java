package com.kolberg.appussdmanager.DAO;

import java.util.ArrayList;

public class Operation {

    String id,code_server,code_operation,operation;
    ArrayList<Ligne_Operation> list_operation_data;

    public Operation() {
    }

    public Operation(String id, String code_server, String code_operation,
                     String operation, ArrayList<Ligne_Operation> list_operation_data) {
        this.id = id;
        this.code_server = code_server;
        this.code_operation = code_operation;
        this.operation = operation;
        this.list_operation_data = list_operation_data;
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

    public String getCode_operation() {
        return code_operation;
    }

    public void setCode_operation(String code_operation) {
        this.code_operation = code_operation;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ArrayList<Ligne_Operation> getList_operation_data() {
        return list_operation_data;
    }

    public void setList_operation_data(ArrayList<Ligne_Operation> list_partner_data) {
        this.list_operation_data = list_partner_data;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id='" + id + '\'' +
                ", code_server='" + code_server + '\'' +
                ", code_operation='" + code_operation + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }
}
