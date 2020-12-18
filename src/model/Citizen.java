package model;

public class Citizen {
    private int livingX;
    private int livingY;
    private int workY;
    private int workX;
    private String name;

    public Citizen(){}

    public Citizen(int livingX, int livingY, int workY, int workX, String name) {
        this.livingX = livingX;
        this.livingY = livingY;
        this.workY = workY;
        this.workX = workX;
        this.name = name;
    }

    public int getLivingX() {
        return livingX;
    }

    public int getLivingY() {
        return livingY;
    }

    public int getWorkY() {
        return workY;
    }

    public int getWorkX() {
        return workX;
    }

    public String getName() {
        return name;
    }
}
