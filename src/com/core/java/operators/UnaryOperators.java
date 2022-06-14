package com.core.java.operators;


/*      Arithmetic Operators +,-,/,%,*
        Assignment Operators
        Relational Operators
        Logical Operators
        Unary Operators +,-,++,-- !
        Bitwise Operators*/
public class UnaryOperators {
    public static void main(String[] args) {
        // declare variables
        int a = 12, b = 12;
        int result1, result2;

        // original value
        System.out.println("Value of a: " + a);

        // increment operator
        result1 =a++;
        System.out.println("After increment: " + result1);
        System.out.println("Value of a: " + a);
       System.out.println("Value of b: " + b);

        // decrement operator
        result2 = b--;
        System.out.println("After decrement: " + result2);
        System.out.println("Value of b: " + b);

    }
}
