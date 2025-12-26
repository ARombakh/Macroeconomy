/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macroeconomy.farming;

import macroeconomy.Purchase;
import macroeconomy.fertilizers.Fertilizer;

/**
 *
 * @author artyom
 */
public class Farm {
    private static int counter = 0;
    private int id;
    private int food;
    private int money;
    private double productivity;
    private Fertilizer fertilizer;
    private double fertilizerQty;

    public Fertilizer getFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(Fertilizer fertilizer) {
        this.fertilizer = fertilizer;
    }

    public double getFertilizerQty() {
        return fertilizerQty;
    }

    public void setFertilizerQty(double fertilizerQty) {
        this.fertilizerQty = fertilizerQty;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Farm.counter = counter;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void setProductivity(double productivity) {
        this.productivity = productivity;
    }

    public double getProductivity() {
        return productivity;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    
    public Farm (double productivity) {
        setId(getCounter());
        setProductivity(productivity);
        setCounter(getCounter() + 1);
    }
    
    public void payMoney(int money) {
        setMoney(getMoney() - money);
    }
    
    public void spendFertilizer (double fertilizer) {
        setFertilizerQty(getFertilizerQty() - fertilizer);
    }
    
    public void produceFood (int food) {
        setFood(getFood() + food);
    }
    
    public void sellFood (Purchase purchase) {
        setFood(getFood() - purchase.getUnits());
        setMoney(getMoney() + purchase.getMoney());
    }
    
    public String state () {
        return ("Farm id: " + getId() + "\n" +
                "food: " + getFood() + "\n" +
                "money: " + getMoney() + "\n" +
                "fertilizer: " + getFertilizerQty() + "\n" +
                "productivity: " + getProductivity() + "\n");
    }
}
