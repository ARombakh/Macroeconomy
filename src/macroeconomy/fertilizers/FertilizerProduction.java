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
    private Worker worker;
    private int money;
    private int fertilizerQuant;

    public int getMoney() {
        return money;
    }
    
    public int getFertilizerQuant() {
        return fertilizerQuant;
    }

    public Fertilizer getFertilizer() {
        return fertilizer;
    }

    public FertilizerPlant getPlant() {
        return plant;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setFertilizerQuant(int fertilizerQuant) {
        this.fertilizerQuant = fertilizerQuant;
    }
    
    public void setFertilizer(Fertilizer fertilizer) {
        this.fertilizer = fertilizer;
    }

    public void setPlant(FertilizerPlant plant) {
        this.plant = plant;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
    
    public FertilizerProduction(Fertilizer fertilizer, FertilizerPlant plant,
                                Worker worker) {
        setFertilizer(fertilizer);
        setPlant(plant);
        setWorker(worker);
    }
        
    public void produce(double salary) {
        setMoney((int)salary);
        setFertilizerQuant((int)(salary * worker.getProductivity() *
                            plant.getProductivity() /
                            fertilizer.getWorkPerUnit()));
        
        getWorker().receiveMoney((int)salary);
        getPlant().payMoney((int)salary);
        getPlant().produceFertilizer(getFertilizerQuant());
    }
}
