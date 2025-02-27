package com.datapackage.model;

public class Driver {
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

    public Driver(int id, String orderNumber, String customerRegNumber, String nicNumber, String customerName, 
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

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getOrderNumber() { return orderNumber; }
    public void setOrderNumber(String orderNumber) { this.orderNumber = orderNumber; }

    public String getCustomerRegNumber() { return customerRegNumber; }
    public void setCustomerRegNumber(String customerRegNumber) { this.customerRegNumber = customerRegNumber; }

    public String getNicNumber() { return nicNumber; }
    public void setNicNumber(String nicNumber) { this.nicNumber = nicNumber; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getVehicleCategory() { return vehicleCategory; }
    public void setVehicleCategory(String vehicleCategory) { this.vehicleCategory = vehicleCategory; }

    public double getKilometers() { return kilometers; }
    public void setKilometers(double kilometers) { this.kilometers = kilometers; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}
