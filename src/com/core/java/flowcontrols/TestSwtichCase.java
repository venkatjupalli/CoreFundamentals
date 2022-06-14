package com.core.java.flowcontrols;

public class TestSwtichCase {
    public enum Day {
        Sun, Mon, Tue, Wed, Thu, Fri, Sat,venkat,urname,
    }
    public static void main(String[] args) {

       /* if(true){
        }else{
        }
        int number=10;
        double d=0.12343242342343232;
        //Switch expression
        switch(d){
            case 10: System.out.println("10");
                //break;
            case 20: System.out.println("20");
                //break;
            case 30: System.out.println("30");
                break;
           default:System.out.println("Not in 10, 20 or 30");
        }*/

        int level=0;
        final int y=20;
        switch(level){
         case 0: level=1;
                break;
            case y: level=2;
                break;
            default: level=0;
                break;
        }
        System.out.println("Your Level is: "+level);
        //int i=0;


        Day[] days = Day.values();
        for (Day day : days) {
            switch (day) {
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }
        }
}
