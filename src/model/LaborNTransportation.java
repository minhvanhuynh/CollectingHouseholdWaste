/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author huynh
 */
public class LaborNTransportation 
{
    public static final int COST_PER_HOUR = 120000;
    private double timeWorking;

    public LaborNTransportation() {
    }

    public LaborNTransportation(double timeWorking) {
        this.timeWorking = timeWorking;
    }

    public double getTimeWorking() {
        return timeWorking;
    }

    public void setTimeWorking(double timeWorking) {
        this.timeWorking = timeWorking;
    }
}
