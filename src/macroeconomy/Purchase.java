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

    public Farm getFarm() {
        return farm;
    }

    public Reseller getReseller() {
        return reseller;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public void setReseller(Reseller reseller) {
        this.reseller = reseller;
    }
    
    public Purchase (Farm farm, Reseller reseller) {
        setFarm(farm);
        setReseller(reseller);
    }
    
    public void makePurchase(int units, int price) {
        farm.sellFood(units, price);
        reseller.buyFood(units, price);
    }
}
