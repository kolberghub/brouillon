package com.kolberg.appussdmanager.DAO;

public class Ligne_Operation {
    String id,code_server,code_operation,input,output_1,output_2,action,isFinal;

    public Ligne_Operation() {
    }

    public Ligne_Operation(String id, String code_server, String code_operation, String input, String output_1,
                           String output_2, String action, String isFinal) {
        this.id = id;
        this.code_server = code_server;
        this.code_operation = code_operation;
        this.input = input;
        this.output_1 = output_1;
        this.output_2 = output_2;
        this.action = action;
        this.isFinal = isFinal;
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

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput_1() {
        return output_1;
    }

    public void setOutput_1(String output_1) {
        this.output_1 = output_1;
    }

    public String getOutput_2() {
        return output_2;
    }

    public void setOutput_2(String output_2) {
        this.output_2 = output_2;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(String isFinal) {
        this.isFinal = isFinal;
    }

    @Override
    public String toString() {
        return "Ligne_Operation{" +
                "id='" + id + '\'' +
                ", code_server='" + code_server + '\'' +
                ", code_operation='" + code_operation + '\'' +
                ", input='" + input + '\'' +
                ", output_1='" + output_1 + '\'' +
                ", output_2='" + output_2 + '\'' +
                ", action='" + action + '\'' +
                ", isFinal='" + isFinal + '\'' +
                '}';
    }
}
