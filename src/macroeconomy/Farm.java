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
    private double fertilizerQty;

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
    
    public void produceFood (Farming farming) {
        setFood(getFood() + farming.getFood());
        setMoney(getMoney() - farming.getMoney());
        setFertilizerQty(getFertilizerQty() - farming.getFertilizerQty());
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
