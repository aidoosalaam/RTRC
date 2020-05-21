package com.andela.buildsdgs.rtrc.models;

import androidx.annotation.NonNull;

public class Transaction {
    private int transactionId;
    private String vehicleName;
    private String vehicleCategory;
    private String transactionAmount;
    private String transactionTime;

    public Transaction(int transactionId, String vehicleName, String vehicleCategory, String transactionAmount, String transactionTime) {
        this.transactionId = transactionId;
        this.vehicleName = vehicleName;
        this.vehicleCategory = vehicleCategory;
        this.transactionAmount = transactionAmount;
        this.transactionTime = transactionTime;
    }

    public Transaction() {
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }
}
