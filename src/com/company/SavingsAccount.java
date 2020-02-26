package com.company;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int idNum, double startBal, double irRate) {
        super(idNum, startBal);
        interestRate = irRate;
    }

    public void withdraw(double amount) {
        double x = currentBalance();
        if (amount < x) {
            decreaseBalance(amount);
        }
    }

    public double monthlyInterest() {
        double x = interestRate * currentBalance();
        return x /12.0;
    }


}
