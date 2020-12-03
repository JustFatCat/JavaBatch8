package com.syntax.class26;

public class VehicleTester {
    public static void main(String[] args) {
        //Car car = new Car(); abstract classes can not create objects
        Vehicle tesla = new Tesla("Red", "model", "Tesla");
        tesla.brake();
        tesla.drive();
        tesla.start();
        tesla.stop();
        System.out.println("Number of vehicle created " + Vehicle.totalVehicle);

        new Toyota("yellow", "model1", "Toyota");
        System.out.println("Number of vehicle created " + Vehicle.totalVehicle);
    }
}
