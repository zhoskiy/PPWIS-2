package model;

import java.util.Vector;

public class Driver {
    private int salary;
    private int irritationLevel;
    private int maxIrritationLevel;
    private int countWorkedRouts;
    private BusPark busPark;
    private Citizen citizen;
    private Vector<Boolean> schedule;

    public Driver(int salary, BusPark busPark, Citizen citizen, Vector<Boolean> schedule) {
        this.salary = salary;
        this.busPark = busPark;
        this.citizen = citizen;
        this.schedule = schedule;
        irritationLevel = 0;
        maxIrritationLevel = 10;
        countWorkedRouts = 0;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public BusPark getBusPark() {
        return busPark;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public Vector<Boolean> getSchedule() {
        return schedule;
    }

    public void irritationLevelPlus(){
        irritationLevel++;
    }

    public void workedRoutsPlus(){
        maxIrritationLevel++;
    }

    public int getCountWorkedRouts() {
        return countWorkedRouts;
    }

    public int getMaxIrritationLevel() {
        return maxIrritationLevel;
    }

    public int getIrritationLevel() {
        return irritationLevel;
    }
}
