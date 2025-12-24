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
public class FertilizerOutput {
    private FertilizerPlant plant;
    private Worker worker;
    private Fertilizer fertilizer;
    private int money;
    private int fertilizerQuant;

    public FertilizerPlant getPlant() {
        return plant;
    }

    public Worker getWorker() {
        return worker;
    }

    public Fertilizer getFertilizer() {
        return fertilizer;
    }

    public int getMoney() {
        return money;
    }

    public int getFertilizerQuant() {
        return fertilizerQuant;
    }

    public void setPlant(FertilizerPlant plant) {
        this.plant = plant;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void setFertilizer(Fertilizer fertilizer) {
        this.fertilizer = fertilizer;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setFertilizerQuant(int fertilizerQuant) {
        this.fertilizerQuant = fertilizerQuant;
    }
    
    public FertilizerOutput(Worker worker, FertilizerPlant plant,
                                Fertilizer fertilizer) {
        setWorker(worker);
        setPlant(plant);
        setFertilizer(fertilizer);
    }
    
    public void produceFertilizer(double salary) {        
        setMoney((int)salary);
        setFertilizerQuant((int)(salary * worker.getProductivity() *
                            plant.getProductivity() /
                            fertilizer.getWorkPerUnit()));
    }
    
    public String state() {
        return ("""
                FertilizerProduction: 
                money: """ + getMoney() + "\n" +
                "qty: " + getFertilizerQuant() + "\n");
    }
}
