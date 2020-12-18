package model;

public class BusStop {
    private int time;
    private Building building;

    public BusStop(int x, int y, String type) {
        this.building = new Building(x, y, type);
    }

    public void updateTime(){
        time--;
    }

    public void addTime(int time){
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public Building getBuilding() {
        return building;
    }
}
