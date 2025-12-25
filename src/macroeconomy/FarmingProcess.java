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
    private static int counter = 0;
    private int id;
    private Farm farm;
    private Worker worker;
    private int food;
    private int money;
    private double fertilizerQty;
        
    public FarmingProcess(Worker worker, Farm farm) {
        setId(getCounter());
        setCounter(getCounter() + 1);
        setWorker(worker);
        setFarm(farm);
    }

    public Farm getFarm() {
        return farm;
    }

    public Worker getWorker() {
        return worker;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public int getFood() {
        return food;
    }

    public int getMoney() {
        return money;
    }

    public double getFertilizerQty() {
        return fertilizerQty;
    }

    public static void setCounter(int counter) {
        FarmingProcess.counter = counter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setFertilizerQty(double fertilizerQty) {
        this.fertilizerQty = fertilizerQty;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
    
    public void produceFood (int salary) {
        doWork (salary);
        updateContractors();
    }
    
    public void produceFood (int salary, Fertilizer fertilizer) {
        doWork (salary, fertilizer);
        updateContractors();
    }

    public void doWork (int salary) {
        setMoney(salary);
        setFood((int)(worker.getProductivity() * salary *
                        farm.getProductivity()));
        setFertilizerQty(0);
    }
    
    public void doWork (int salary, Fertilizer fertilizer) {
        doWork(salary);
        setFertilizerQty((double)getFood());
        setFood((int)(getFood() * fertilizer.getProdEnahnceQuot()));
    }

    public void updateContractors() {
        getWorker().receiveMoney(getMoney());
        getFarm().payMoney(getMoney());
        getFarm().produceFood(getFood());
        getFarm().spendFertilizer(getFertilizerQty());
    }
    
    @Override
    public String toString() {
        return "FarmingProcess id: " + getId() + "\n" +
                "farm id: " + farm.getId() + "\n" +
                "worker id: " + worker.getId() + "\n" +
                "food: " + getFood() + "\n" +
                "money: " + getMoney() + "\n" +
                "fertilizer: " + getFertilizerQty() + "\n";
    }
}