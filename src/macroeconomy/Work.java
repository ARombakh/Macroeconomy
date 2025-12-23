/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macroeconomy;

/**
 *
 * @author artyom
 */
public class Work {
    private Worker worker;
    private Farm farm;
    private int food;
    private int money;

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
    
    public Work (Worker worker, Farm farm) {
        setWorker(worker);
        setFarm(farm);
    }
    
    public void doWork (int salary) {
        setMoney(salary);
        setFood((int)(worker.getProductivity() * salary
                        * farm.getProductivity()));
    }
}
