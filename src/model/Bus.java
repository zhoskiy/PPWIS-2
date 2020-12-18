package model;

public class Bus {
    private Automobile automobile;
    private Driver driver;
    private boolean status;
    private Road currentRoad;

    public Bus(int fuel, int volumeOfTank, int movingSpeed, int fuelPerKilometer, String number) {
        this.automobile = new Automobile(fuel, volumeOfTank, movingSpeed, fuelPerKilometer, number);
    }

    public void nextRoad(){
        int currentIndex = automobile.getRout().getRoads().indexOf(currentRoad);
        currentRoad = automobile.getRout().getRoads().get(++currentIndex);
    }

    public void stay(){
        status = false;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Automobile getAutomobile() {
        return automobile;
    }

    public void setAutomobile(Automobile automobile) {
        this.automobile = automobile;
    }
}
