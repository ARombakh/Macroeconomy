/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macroeconomy.banking;

/**
 *
 * @author artyom
 */
public class Bank {
    private Deposit deposit;
    private Loan loan;
    private int money;

    public void setMoney(int money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money amount of Bank cannot " +
                    "be lesser than 0\n");
        }
        this.money = money;
    }

    public void setDeposit(Deposit deposit) {
        setMoney(deposit.getSum() + getMoney());
        this.deposit = deposit;
    }

    public void setLoan(Loan loan) {
        setMoney(getMoney() - loan.getSum());
        this.loan = loan;
    }

    public Deposit getDeposit() {
        return deposit;
    }

    public Loan getLoan() {
        return loan;
    }

    public int getMoney() {
        return money;
    }
    
    public void extendLoan(int sum, int term, double interest) {
        Loan loan = new Loan(sum, term, interest);
        setLoan(loan);
    }
    
    public String toString() {
        return "Bank\n" +
                "Loan of Bank:\n" + 
                (getLoan() == null ? "" : getLoan().toString()) +
                "Deposit of Bank:\n" + 
                (getDeposit() == null ? "" : getDeposit().toString()) +
                "money: " + getMoney() + "\n";
    }
}
