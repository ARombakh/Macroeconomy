/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package macroeconomy;

import macroeconomy.banking.Bank;
import macroeconomy.farming.FarmingProcess;
import macroeconomy.farming.Farm;
import macroeconomy.fertilizers.FertilizerPlant;
import macroeconomy.fertilizers.Fertilizer;
import macroeconomy.fertilizers.FertilizerProduction;

/**
 *
 * @author artyom
 */
public class Macroeconomy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Farm farm = new Farm(1.5);
        
        Bank bank = new Bank();
        bank.setMoney(500);
        
        System.out.println(farm.toString());
        
        System.out.println(bank.toString());
        
        System.out.println("After loan extension");
        bank.extendLoan(100, 5, .06);
        farm.setLoan(bank.getLoan());
        
        System.out.println(bank.toString());
        
        System.out.println(farm.toString());
    }
}