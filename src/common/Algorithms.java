/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import model.Dump;
import model.LaborNTransportation;
import model.Truck;

/**
 *
 * @author huynh
 */
public class Algorithms {

    public int[] computeTotalGarbage(String input) {
        String[] wasteRaw = input.split("\\s+");
        int[] waste = new int[wasteRaw.length];
        for (int i = 0; i < wasteRaw.length; i++) {
            try {
                waste[i] = Integer.parseInt(wasteRaw[i]);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        return waste;
    }

    public double[] computeTimesGoToDump(int waste[]) {
        int weightGabage = 0;
        double timesGoToDump = 0;
        double time = 0;
        for (int i = 0; i < waste.length; i++) {
            if (weightGabage + waste[i] <= Truck.CAPACITY) {
                weightGabage += waste[i];
                time += Truck.TIME_LOAD_GARBAGE;
            } else {
                timesGoToDump++;
                time += Truck.TIME_GO_DUMP;
                i--;
                weightGabage = 0;
            }
        }
        if(weightGabage != Truck.CAPACITY)
            time += Truck.TIME_GO_DUMP;
        return new double[]{time, timesGoToDump};
    }

    public double computeCostSpend(double input[]) {
       return input[0] * LaborNTransportation.COST_PER_HOUR + input[1] * Dump.COST;      
        
    }
}
