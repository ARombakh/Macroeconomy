/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macroeconomy;

import macroeconomy.fertilizers.Fertilizer;

/**
 *
 * @author artyom
 */
public class FarmingProcess {
    private Farm farm;
    private Worker worker;
    private Farming farming;

    public Farm getFarm() {
        return farm;
    }

    public Worker getWorker() {
        return worker;
    }

    public Farming getFarming() {
        return farming;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void setFarming(Farming farming) {
        this.farming = farming;
    }
    
    public FarmingProcess(Worker worker, Farm farm) {
        setWorker(worker);
        setFarm(farm);
        setFarming(new Farming(worker, farm));
    }
    
    public void produce(int salary) {
        getFarming().doWork(salary);
        updateContractors();
    }
    
    public void produce(int salary, Fertilizer fertilizer) {
        getFarming().doWork(salary, fertilizer);
        updateContractors();
    }
    
    public void updateContractors() {
        getWorker().receiveMoney(farming);
        getFarm().produceFood(farming);
    }
}
