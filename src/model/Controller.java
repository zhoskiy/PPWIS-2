package model;

import java.util.Vector;

public class Controller {
    private BusPark busPark;
    public Controller(BusPark busPark) {
        this.busPark = busPark;
    }

    public void updateDriver(Driver driver, int indexDriver){

    }
    public void updateBusPark(BusPark busPark){}
    public void updateBus(Bus bus){}

    public BusPark getBusPark() {
        return busPark;
    }

    public void setBusPark(BusPark busPark) {
        this.busPark = busPark;
    }

    public Vector<Bus> getBuses(){
        return busPark.getBuses();
    }

    public  Vector<Driver> getDrivers(){
       return busPark.getDriverBase().getDrivers();
    }
}
