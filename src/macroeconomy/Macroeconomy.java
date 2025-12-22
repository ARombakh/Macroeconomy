/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package macroeconomy;

/**
 *
 * @author artyom
 */
public class Macroeconomy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Farm farm = new Farm(0, 1.5);
        
        farm.setFood(50);
        farm.setMoney(0);
        
        System.out.printf(farm.state());
        
        Reseller reseller = new Reseller(0, 500);
        
        System.out.println(reseller.state());
        
        Purchase purchase = new Purchase(farm, reseller);
        
        purchase.makePurchase(5, 3);
        
        System.out.printf("After purchase\n");
        
        System.out.println(farm.state());
        
        System.out.println(reseller.state());
    }
}
