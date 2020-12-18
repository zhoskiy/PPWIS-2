package model;

import java.util.Vector;

public class Building {
    private int x;
    private int y;
    private String type;

    public Building(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Vector<Integer> getXY() {
        Vector<Integer> xy = new Vector<Integer>();
        xy.add(x);
        xy.add(y);
        return xy;
    }
}
