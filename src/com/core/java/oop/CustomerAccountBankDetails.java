package com.core.java.oop;

public  abstract class CustomerAccountBankDetails {
   public abstract double printBalance(long accountNumber);
    abstract double withDrawal(long accountNumber);
   protected abstract void printMiniStatement(long accountNumber);
    void rateOfInterest(){}

}
