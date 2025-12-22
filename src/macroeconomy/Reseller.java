/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macroeconomy;

/**
 *
 * @author artyom
 */
public class Reseller {
    int id;
    int money;
    int food;

    public int getMoney() {
        return money;
    }

    public int getFood() {
        return food;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Reseller(int id, int money) {
        setId(id);
        setMoney(money);
    }
    
    public void buyFood (int units, int price) {
        int cost = units * price;
        setFood(getFood() + units);
        setMoney(getMoney() - cost);
    }
    
    public void sellFood (int units, int price) {
        int cost = units * price;
        setFood(getFood() - units);
        setMoney(getMoney() + cost);
    }
    
    public String state () {
        return ("id: " + getId() + "\n" +
                "money: " + getMoney() + "\n" +
                "food: " + getFood() + "\n");
    }
}
