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
    private static int counter = 0;
    private int id;
    private int food;
    private int money;
    private double productivity;

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
    
    public void produceFood (Work work) {
        setFood(getFood() + work.getFood());
        setMoney(getMoney() - work.getMoney());
    }
    
    public void sellFood (Purchase purchase) {
        setFood(getFood() - purchase.getUnits());
        setMoney(getMoney() + purchase.getMoney());
    }
    
    public String state () {
        return ("Farm id: " + getId() + "\n" +
                "food: " + getFood() + "\n" +
                "money: " + getMoney() + "\n" +
                "productivity: " + getProductivity() + "\n");
    }
}
