package model;
import java.util.Vector;

public class Injector {
    Injector(){
        createBusPark();
        createBusStop();
        createDriver();
        createDriverBase();
        createGraphicInterface();
        createRoad();
        createRout();
    }

    public Bus createBus(){
        return new Bus((int) Math.random()*10, (int) Math.random()*10,
                (int) Math.random()*10, (int) Math.random()*10,
                Integer.toString((int) Math.random()*20));
    }
    public DriverBase createDriverBase(){
        return new DriverBase();
    }
    public BusPark createBusPark(){
        return new BusPark((int) Math.random()*10, (int) Math.random()*10, "Bus park");
    }
    public Driver createDriver(){
        return new Driver((int) Math.random()*100, createBusPark(), createCitizen(), new Vector<Boolean>(7));
    }
    public BusStop createBusStop(){
        return new BusStop((int) Math.random()*10, (int) Math.random()*10, "Bus stop");
    }
    public Citizen createCitizen(){
        return new Citizen();
    }
    public Controller createController(){
        return new Controller(createBusPark());
    }
    public Road createRoad(){
        return new Road((int) Math.random()*10, (int) Math.random()*10,(int) Math.random()*10,
                (int) Math.random()*10);
    }
    public Rout createRout(){
        Vector<BusStop> busStops = new Vector<>();
        Vector<Road> roads = new Vector<>();
        for (int i = 0; i < 7; i++) {
            busStops.add(createBusStop());
            roads.add(createRoad());
        }
        return new Rout(roads, busStops);
    }
    public GraphicInterface createGraphicInterface(){
        return new GraphicInterface(createController());
    }

}
