/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macroeconomy.banking;

/**
 *
 * @author artyom
 */
public class Loan {
    private int sum;
    private int term;
    private double interest;
    
    public Loan(int sum, int term, double interest) {
        setSum(sum);
        setTerm(term);
        setInterest(interest);
    }

    public int getSum() {
        return sum;
    }

    public int getTerm() {
        return term;
    }

    public double getInterest() {
        return interest;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String toString() {
        return "Loan\n" +
                "sum: " + getSum() + "\n" +
                "term: " + getTerm() + "\n" +
                "interest: " + getInterest() + "\n";
    }
}
