/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macroeconomy;

/**
 *
 * @author artyom
 */
public class Worker {
    private double productivity;
    private int money;
    private int deposit;
    private int foodCapacity;
    private int foodConsumptMnth;
    private int labor;

    public double getProductivity() {
        return productivity;
    }

    public int getMoney() {
        return money;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getFoodCapacity() {
        return foodCapacity;
    }

    public int getFoodConsumptMnth() {
        return foodConsumptMnth;
    }

    public int getLabor() {
        return labor;
    }

    public void setProductivity(double productivity) {
        this.productivity = productivity;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void setFoodCapacity(int foodCapacity) {
        this.foodCapacity = foodCapacity;
    }

    public void setFoodConsumptMnth(int foodConsumptMnth) {
        this.foodConsumptMnth = foodConsumptMnth;
    }

    public void setLabor(int labor) {
        this.labor = labor;
    }
}
