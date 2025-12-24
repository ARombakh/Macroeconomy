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
public class Farming {
    private static int counter = 0;
    private int id;
    private Worker worker;
    private Farm farm;
    private int food;
    private int money;
    private double fertilizerQty;

    public double getFertilizerQty() {
        return fertilizerQty;
    }

    public int getFood() {
        return food;
    }

    public int getMoney() {
        return money;
    }
    
    public Worker getWorker() {
        return worker;
    }

    public Farm getFarm() {
        return farm;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setFertilizerQty(double fertilizerQty) {
        this.fertilizerQty = fertilizerQty;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setCounter(int counter) {
        Farming.counter = counter;
    }
    
    public Farming (Worker worker, Farm farm) {
        setId(getCounter());
        setCounter(getCounter() + 1);
        setWorker(worker);
        setFarm(farm);
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
    
    public String state () {
        return "Farming id: " + getId() + "\n" +
                "worker id: " + worker.getId() + "\n" +
                "farm id: " + farm.getId() + "\n" +
                "food: " + getFood() + "\n" +
                "money: " + getMoney() + "\n" +
                "fertilizerQty: " + getFertilizerQty() + "\n";
    }
}
