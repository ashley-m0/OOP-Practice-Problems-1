package ex26.base;

import java.lang.Math;

public class PaymentCalculator {

    private double balance;
    private double APR;
    private double monthlyPayment;

    public PaymentCalculator(double bal, double rate, double mp){
        this.balance = bal;
        this.APR = rate / 100.0;
        this.monthlyPayment = mp;
    }

    public void setBalance(double bal){
        this.balance = bal;
    }

    public double getBalance(){
        return balance;
    }

    public void setAPR(double rate){
        this.APR = rate / 100.0;
    }
    public double getAPR(){
        return APR;
    }

    public void setMonthlyPayment(double mp){
        this.monthlyPayment = mp;
    }

    public double getMonthlyPayment(){
        return monthlyPayment;
    }

    public double calculateMonthsUntilPaidOff(){
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double dailyRate = APR / 365.0;
        double months = -(1.0/30.0) * Math.log(1 + balance/monthlyPayment * (1.0 - Math.pow((1.0 + dailyRate),30.0))) / Math.log(1.0 + dailyRate);

        //round up if necessary
        double leftover = months % 1.0;
        months -= leftover;
        if (leftover != 0.0){
            months += 1.0;
        }

        return months;
    }
}
