package model;

import java.util.Vector;

public class DriverBase {
    private Vector<Driver> drivers;

    public DriverBase() {
        drivers = new Vector<>();
    }

    public DriverBase(Vector<Driver> drivers) {
        this.drivers = drivers;
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    public void delDriver(Driver driver){
        drivers.remove(driver);
    }

    public Vector<Driver> getDrivers() {
        return drivers;
    }
}
