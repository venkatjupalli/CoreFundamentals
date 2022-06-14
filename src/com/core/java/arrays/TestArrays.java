package com.core.java.arrays;

import com.core.java.bean.Student;

public class TestArrays {

     int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
     // addition of all array object values
    // multiply with any one number and print the values
    //find the average of array object values
      String[] months=new String[50];

    public void TestArrays(){
        months[0]="venkat";
        months[0]="JAN";
        months[1]="FEB";
        months[2]="MAR";
        months[3]="APR";
        months[4]="MAY";
        months[5]="JUN";
        months[6]="JUL";
        months[7]="AUG";
        months[8]="SEP";
        months[9]="OCT";
        months[10]="NOV";
        months[9]="DEC";
        months[49]="test";

        System.out.println("size of an array:"+months.length);
        System.out.println(months[49]);
       // System.out.println(months[10]);
        int sum = 0;
        Double average;
        for (int number: numbers) {
            sum += number;
        }
        int arrayLength = numbers.length;
        average =  ((double)sum / (double)arrayLength);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
    public static void main(String[] args) {
        TestArrays t = new TestArrays();
        t.TestArrays();
        Student[] arr;
        arr = new Student[5];
        // initialize the  elements of the array
        arr[0] = new Student(1, "student1");
        arr[1] = new Student(2, "student1");
        arr[2] = new Student(3, "student3");
        arr[3] = new Student(4, "student4");
        arr[4] = new Student(5, "student5");
        // accessing the elements of the specified array
        for (Student s:arr
             ) {
         //System.out.println(s.name+"--"+s.rollno);
        }
        for (int i = 0; i < arr.length; i++) {
            //System.out.println("Element at " + i + " : " +
                   // arr[i].rollno + " " + arr[i].name);
        }
    }
}
