package com.core.java.oop;

public class ICICIBank extends CustomerAccountBankDetails{
    @Override
    public double printBalance(long accountNumber) {
        return 0;
    }

    @Override
    double withDrawal(long accountNumber) {
        return 0;
    }

    @Override
   protected void printMiniStatement(long accountNumber) {

    }

    public static void main(String[] args) {
        ICICIBank iciciBank=new ICICIBank();
        iciciBank.printBalance(12345);
    }
}
