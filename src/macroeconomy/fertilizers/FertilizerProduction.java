/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macroeconomy.fertilizers;

import macroeconomy.Worker;

/**
 *
 * @author artyom
 */
public class FertilizerProduction {
    private Fertilizer fertilizer;
    private FertilizerPlant plant;
    private FertilizerOutput output;
    private Worker worker;

    public Fertilizer getFertilizer() {
        return fertilizer;
    }

    public FertilizerPlant getPlant() {
        return plant;
    }

    public FertilizerOutput getOutput() {
        return output;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setFertilizer(Fertilizer fertilizer) {
        this.fertilizer = fertilizer;
    }

    public void setPlant(FertilizerPlant plant) {
        this.plant = plant;
    }

    public void setOutput(FertilizerOutput output) {
        this.output = output;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
    
    public FertilizerProduction(Fertilizer fertilizer, FertilizerPlant plant,
                                Worker worker) {
        setFertilizer(fertilizer);
        setPlant(plant);
        setWorker(worker);
        setOutput(new FertilizerOutput(worker, plant, fertilizer));
    }
    
    public void produce(double salary) {
        getOutput().produceFertilizer(salary);
        getWorker().receiveMoney(output);
        getPlant().produceFertilizer(output);
    }
    /*
    public static void main(String[] args) {
        Fertilizer fertilizer = new Fertilizer(2.5, 1.3);
        Worker worker = new Worker(1, 1.7);
        FertilizerPlant plant = new FertilizerPlant(1.8);

        System.out.println("Before production");
        
        FertilizerProduction production = new FertilizerProduction(fertilizer,
                                        plant, worker);
        
        System.out.println(plant.state());
        System.out.println(worker.state());
        
        System.out.println("After production");
        
        production.produce(17.0);
        
        System.out.println(production.getPlant().state());
        System.out.println(production.getWorker().state());
    }*/
}
