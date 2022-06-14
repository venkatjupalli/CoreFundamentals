package com.core.java.flowcontrols;

public class TestDoWhile {
    public static void main(String[] args) {
       /* int[] numbers = {3, 9, 5, -5}; //sum of arrays numbers
        int i = numbers.length-1; //i=totsal 4-1 1=3
        int sum=0;
        do {
            System.out.println("Print statement aaray pos value:"+numbers[i]);
            sum=sum+numbers[i]; //0+-5 ==-5    -5+5 0 0+9 =9+3
            i--; //i=i-1 //  3 becomes 2 1 0 -1
        } while (i>=0); //2>=0 valid 0=0 falis 2<0-inavlid
        System.out.println("sum::"+sum); //12*/

        int x=0; //x=0
        do{
            x++;  // 1 4 8
            System.out.println(x); //1 4
            if(++x<5) //2<5 5<5 not 9
                continue;
            x++;
            System.out.println(x); //6  10
        }while (++x<10); //3<10 7<10  11<10not valid


    }
}

// 1 4 6 8 10


 /*  int x=0;
        do{
            x++;
            System.out.println(x);
            if(++x<5)
            continue;
            x++;
            System.out.println(x);
        }while (++x<10);*/