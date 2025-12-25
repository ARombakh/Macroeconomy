/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package macroeconomy;

import macroeconomy.fertilizers.FertilizerPlant;
import macroeconomy.fertilizers.Fertilizer;
import macroeconomy.fertilizers.FertilizerProduction;

/**
 *
 * @author artyom
 */
public class Macroeconomy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Farm farm = new Farm(1.5);
        
        farm.setFood(50);
        farm.setMoney(0);
        
        System.out.println(farm.state());
        
        Worker worker = new Worker(0, 1.7);
        
        System.out.println(worker.state());
        
        FarmingProcess fProcess = new FarmingProcess(worker, farm);
        
        fProcess.produceFood(3);
        
        System.out.println(fProcess.toString());
        
        System.out.println("After farming");
        
        System.out.println(farm.state());
        System.out.println(worker.state());

        System.out.println("Before using fertilizer");
        Fertilizer fertilizer = new Fertilizer(2.5, 1.8);
        
        farm.setFertilizer(fertilizer);
        farm.setFertilizerQty(15);
        
        System.out.println(farm.state());
        
        System.out.println(fertilizer.state());
        
        FarmingProcess fProcess2 = new FarmingProcess(worker, farm);
        
        fProcess2.produceFood(3);
        
        System.out.println(fProcess2.toString());
        
        System.out.println("After fertilizer");

        System.out.println(farm.state());
        System.out.println(worker.state());
        
        FertilizerPlant plant = new FertilizerPlant(1.4);
        
        FertilizerProduction fProd = new FertilizerProduction(fertilizer,
                                        plant, worker);
        
        plant.setMoney(20);
        
        System.out.println("Producing fertilizers");
        
        System.out.println(plant.toString());
        
        System.out.println(fProd.toString());
        fProd.produce(17);
        
        System.out.println("Fertilizers production");
        
        System.out.println(plant.toString());
        System.out.println(fProd.toString());
    }
}