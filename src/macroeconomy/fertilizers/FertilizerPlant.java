/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macroeconomy.fertilizers;

/**
 *
 * @author artyom
 */
public class FertilizerPlant {
    private static int counter = 0;
    private int id;
    private int money;
    private double productivity;
    private int fertilizerQty;
    
    public int getMoney() {
        return money;
    }

    public double getProductivity() {
        return productivity;
    }

    public void setMoney (int money) {
        this.money = money;
    }

    public void setProductivity(double productivity) {
        this.productivity = productivity;
    }

    public int getFertilizerQty() {
        return fertilizerQty;
    }

    public void setFertilizerQty(int fertilizerQty) {
        this.fertilizerQty = fertilizerQty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        FertilizerPlant.counter = counter;
    }
    
    public FertilizerPlant(double productivity) {
        setId(getCounter());
        setProductivity(productivity);
        setCounter(getCounter() + 1);
    }
    
    public void produceFertilizer(int fertilizer) {
        setFertilizerQty(getFertilizerQty() + fertilizer);
    }
    
    public void payMoney(int money) {
        setMoney(getMoney() - money);
    }
    
    @Override
    public String toString () {
        return ("FertilizerPlant id: " + getId() + "\n" +
                "money: " + getMoney() + "\n" +
                "productivity: " + getProductivity() + "\n" +
                "fertilizerQty: " + getFertilizerQty() + "\n");
    }
}
