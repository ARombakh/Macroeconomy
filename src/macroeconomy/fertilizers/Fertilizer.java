/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macroeconomy.fertilizers;

/**
 *
 * @author artyom
 */
public class Fertilizer {
    private static int counter = 0;
    private int id;
    private double prodEnahnceQuot;
    private double workPerUnit;

    public static int getCounter() {
        return counter;
    }
    
    public double getProdEnahnceQuot() {
        return prodEnahnceQuot;
    }

    public double getWorkPerUnit() {
        return workPerUnit;
    }

    public int getId() {
        return id;
    }

    public static void setCounter(int counter) {
        Fertilizer.counter = counter;
    }

    public void setProdEnahnceQuot(double prodEnahnceQuot) {
        this.prodEnahnceQuot = prodEnahnceQuot;
    }

    public void setWorkPerUnit(double workPerUnit) {
        this.workPerUnit = workPerUnit;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Fertilizer(double prodEnahnceQuot, double workPerUnit) {
        setProdEnahnceQuot(prodEnahnceQuot);
        setWorkPerUnit(workPerUnit);
    }
    
    public String state() {
        return ("Fertilizer id: " + getId() + "\n" +
                "prodEnahnceQuot: " + getProdEnahnceQuot() + "\n" +
                "workPerUnit: " + getWorkPerUnit()) + "\n";
    }
}
