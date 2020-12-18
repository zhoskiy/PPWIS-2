package model;

public class Road {
    private int startPointX;
    private int startPointY;
    private int finishPointX;
    private int finishPointY;

    public Road(int startPointX, int startPointY, int finishPointX, int finishPointY) {
        this.startPointX = startPointX;
        this.startPointY = startPointY;
        this.finishPointX = finishPointX;
        this.finishPointY = finishPointY;
    }

    public int[] getPointsForDraw(){
        int[] roadCoordinates = new int[4];
        return roadCoordinates;
    }
}
