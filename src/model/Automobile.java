package model;

public class Automobile {
    private int fuel;
    private int volumeOfTank;
    private int movingSpeed;
    private int fuelPerKilometer;
    private String number;
    private Rout rout;

    public Automobile(int fuel, int volumeOfTank, int movingSpeed, int fuelPerKilometer, String number) {
        this.fuel = fuel;
        this.volumeOfTank = volumeOfTank;
        this.movingSpeed = movingSpeed;
        this.fuelPerKilometer = fuelPerKilometer;
        this.number = number;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public int getVolumeOfTank() {
        return volumeOfTank;
    }

    public int getMovingSpeed() {
        return movingSpeed;
    }

    public int getFuelPerKilometer() {
        return fuelPerKilometer;
    }

    public String getNumber() {
        return number;
    }

    public Rout getRout() {
        return rout;
    }

    public void setRout(Rout rout) {
        this.rout = rout;
    }
}
