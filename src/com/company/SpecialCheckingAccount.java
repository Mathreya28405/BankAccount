package com.company;

public class SpecialCheckingAccount extends CheckingAccount {

    double minBalance;
    double annualInterest;

    public SpecialCheckingAccount(int idNum, double startBal, double cc, double annualRate, double minimum) {
        super(idNum, startBal, cc);
        minBalance = minimum;
        annualInterest = annualRate;
    }

    public void clearCheck(double amt) {
        if (currentBalance() > minBalance) {
            decreaseBalance(amt);
        }
        else {
            super.clearCheck(amt);
        }
    }

    public double monthlyInterest() {
        if (currentBalance() > minBalance) {
            return (currentBalance() * annualInterest) / 12;
        }
        else {
            return super.monthlyInterest();
        }
    }
}
