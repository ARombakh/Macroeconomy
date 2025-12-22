/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macroeconomy;

/**
 *
 * @author artyom
 */
public class Farm {
    private int id;
    private int labor;
    private int food;
    private int money;
    private double productivity;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLabor(int labor) {
        this.labor = labor;
    }

    public int getLabor() {
        return labor;
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
    
    public Farm (int id, double productivity) {
        setId(id);
        setProductivity(productivity);
    }
    
    public void sellFood (int units, int price) {
        int cost = units * price;
        setFood(getFood() - units);
        setMoney(getMoney() + cost);
    }
    
    public String state () {
        return ("id: " + getId() + "\n" +
                "labor: " + getLabor() + "\n" +
                "food: " + getFood() + "\n" +
                "money: " + getMoney() + "\n" +
                "productivity: " + getProductivity() + "\n");
    }
}
