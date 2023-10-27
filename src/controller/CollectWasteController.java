/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithms;
import common.Library;
import view.Menu;

/**
 *
 * @author huynh
 */
public class CollectWasteController extends Menu<String> {

    protected Library library;
    protected Algorithms algorithm;

    public CollectWasteController() {
        super("=====Collecting Household Waste=====");
        library = new Library();
        algorithm = new Algorithms();
    }

    @Override
    public void execute() {
        String input = library.getString("Enter the amount of garbage at each station in order by quantity (kg) as follows: ");
        int result[] = algorithm.computeTotalGarbage(input);
        double[] timeNTimes = algorithm.computeTimesGoToDump(result);
        System.out.println("Cost: " + algorithm.computeCostSpend(timeNTimes));
    }
}