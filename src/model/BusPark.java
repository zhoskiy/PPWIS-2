package model;

import java.util.Vector;

public class BusPark {
    private Vector<Bus> buses;
    private DriverBase driverBase;
    private Vector<Rout> routs;
    private int money;
    private Building building;
    private Vector<Bus> outBuses;
    private Vector<Bus> inBuses;

    public BusPark(int x, int y, String type) {
        this.buses = new Vector<>();
        this.driverBase = new DriverBase();
        this.building = new Building( x,  y, type);
    }

    public Vector<Bus> getBuses() {
        return buses;
    }

    public Vector<Rout> getRouts() {
        return routs;
    }

    public Vector<Bus> getOutBuses() {
        return outBuses;
    }

    public Vector<Bus> getInBuses() {
        return inBuses;
    }

    public void addBus(Bus bus){
        buses.add(bus);
    }
    public void addRout(Rout rout){
        routs.add(rout);
    }
    public void fillUpBus(Bus bus){
        int indexBus = buses.indexOf(bus);
        buses.get(indexBus).getAutomobile().setFuel(10);
    }
    public void payDriver(Driver driver){}
    public void layOffDriver(Driver driver){}
    public Bus getBus(){
        return buses.get(0);
    }
    public boolean checkBus(Bus bus){
        return true;
    }
    public void calculate(){}


    public DriverBase getDriverBase() {
        return driverBase;
    }

    public Building getBuilding() {
        return building;
    }
}
