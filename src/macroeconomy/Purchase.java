/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macroeconomy;

/**
 *
 * @author artyom
 */
public class Purchase {
    private Farm farm;
    private Reseller reseller;
    private int units;
    private int money;

    public int getUnits() {
        return units;
    }

    public int getMoney() {
        return money;
    }
    
    public Farm getFarm() {
        return farm;
    }

    public Reseller getReseller() {
        return reseller;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public void setReseller(Reseller reseller) {
        this.reseller = reseller;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    public Purchase (Farm farm, Reseller reseller) {
        setFarm(farm);
        setReseller(reseller);
    }
    
    public void makePurchase(int units, int price) {
        setUnits(units);
        setMoney(units * price);
    }
}
