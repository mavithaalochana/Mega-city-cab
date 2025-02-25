package com.datapackage.model;

public class Data {
    private int id;
    private String orderNumber;
    private String customerRegNumber;
    private String nicNumber;
    private String customerName;
    private String address;
    private String telephone;
    private String destination;
    private String vehicleCategory;
    private double kilometers;
    private double totalAmount;

    public Data(int id, String orderNumber, String customerRegNumber, String nicNumber, String customerName,
                String address, String telephone, String destination, String vehicleCategory, double kilometers, double totalAmount) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.customerRegNumber = customerRegNumber;
        this.nicNumber = nicNumber;
        this.customerName = customerName;
        this.address = address;
        this.telephone = telephone;
        this.destination = destination;
        this.vehicleCategory = vehicleCategory;
        this.kilometers = kilometers;
        this.totalAmount = totalAmount;
    }

    public int getId() {
        return id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerRegNumber() {
        return customerRegNumber;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getDestination() {
        return destination;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public double getKilometers() {
        return kilometers;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
