package com.datapackage.model;

public class Booking {
    private String orderNumber;
    private String customerRegNumber;
    private String nicNumber;
    private String customerName;
    private String address;
    private String telephone;
    private String destination;
    private String vehicleCategory;
    private int kilometers;
    private double totalAmount;

    public Booking(String orderNumber, String customerRegNumber, String nicNumber, String customerName, 
                   String address, String telephone, String destination, String vehicleCategory, int kilometers) {
        this.orderNumber = orderNumber;
        this.customerRegNumber = customerRegNumber;
        this.nicNumber = nicNumber;
        this.customerName = customerName;
        this.address = address;
        this.telephone = telephone;
        this.destination = destination;
        this.vehicleCategory = vehicleCategory;
        this.kilometers = kilometers;
        this.totalAmount = calculateTotalAmount();
    }

    private double calculateTotalAmount() {
        double ratePerKm = switch (vehicleCategory.toLowerCase()) {
            case "car" -> 90;
            case "motorbike" -> 40;
            case "threewheeler" -> 60;
            case "van" -> 120;
            default -> 0;
        };
        
        double total = kilometers * ratePerKm;

        // Apply 2% discount for distances over 250 km
        if (kilometers > 250) {
            total *= 0.98;
        }

        return total;
    }

    public String getOrderNumber() { return orderNumber; }
    public String getCustomerRegNumber() { return customerRegNumber; }
    public String getNicNumber() { return nicNumber; }
    public String getCustomerName() { return customerName; }
    public String getAddress() { return address; }
    public String getTelephone() { return telephone; }
    public String getDestination() { return destination; }
    public String getVehicleCategory() { return vehicleCategory; }
    public int getKilometers() { return kilometers; }
    public double getTotalAmount() { return totalAmount; }
}
