package com.datapackage.model;

public class Our {
    private String vehicleName;
    private String vehicleCategory;
    private String vehicleImage;

    public Our(String vehicleName, String vehicleCategory, String vehicleImage) {
        this.vehicleName = vehicleName;
        this.vehicleCategory = vehicleCategory;
        this.vehicleImage = vehicleImage;
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

    public String getVehicleImage() {
        return vehicleImage;
    }

    public void setVehicleImage(String vehicleImage) {
        this.vehicleImage = vehicleImage;
    }
}
