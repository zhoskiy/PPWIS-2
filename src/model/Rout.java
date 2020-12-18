package model;

import java.util.Vector;

public class Rout {
    private Vector<Road> roads;
    private Vector<BusStop> busStops;

    public Rout(Vector<Road> roads, Vector<BusStop> busStops) {
        this.roads = roads;
        this.busStops = busStops;
    }

    public void addRoad(Road road){
        roads.add(road);
    }

    public void delRoad(Road road){
        roads.remove(road);
    }

    public void addBusStop(BusStop busStop){
    busStops.add(busStop);
    }

    public void delBusStop(BusStop busStop){
        busStops.remove(busStop);
    }

    public Vector<Road> getRoads() {
        return roads;
    }

    public Vector<BusStop> getBusStop() {
        return busStops;
    }
}
