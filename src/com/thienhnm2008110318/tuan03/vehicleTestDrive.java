package com.thienhnm2008110318.tuan03;

public class vehicleTestDrive {
    public static void main(String[] args) {
        vehicle Vehicle;
        
        Vehicle = new vehicle("Lê Văn A");
        Vehicle.owner = "Lê Văn A";

        Vehicle = new vehicle("Lê Văn A", "Nissan");
        Vehicle.owner = "Lê Văn A";
        Vehicle.manufacturer = "Nissan";

        Vehicle = new vehicle("Lê Văn A", "Nissan", "GT-R R35");
        Vehicle.owner = "Lê Văn A";
        Vehicle.manufacturer = "Nissan";
        Vehicle.type = "GT-R R35";

        Vehicle = new vehicle("Lê Văn A", "Nissan", "GT-R R35", "B1");
        Vehicle.owner = "Lê Văn A";
        Vehicle.manufacturer = "Nissan";
        Vehicle.type = "GT-R R35";
        Vehicle.license = "B1";

        Vehicle = new vehicle("Lê Văn A", "Nissan", "GT-R R35", "B1", 74);
        Vehicle.owner = "Lê Văn A";
        Vehicle.manufacturer = "Nissan";
        Vehicle.type = "GT-R R35";
        Vehicle.license = "B1";
        Vehicle.capacity_fuel = 74;

    }
}
