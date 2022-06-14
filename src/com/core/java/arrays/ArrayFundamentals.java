package com.core.java.arrays;


// intro
//declar
//inti
// cre in and assi


public class ArrayFundamentals {
    public static void main(String[] args) {


        try{
        int age = 20;
        String name = "name";
        int[] ag;
        String x[];
        x = new String[1];
        x[0] = "str";
        int[] ag11;
        ag11 = new int[10];
    }catch(Exception e){

        }finally {

        }

        String name1;
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};


        int[] age1=new int[7];
        int[]  testData={10,20,20};
        System.out.println(testData[1]);
        age1[0]=10;
        age1[1]=10;
        age1[2]=10;
        age1[3]=10;
        age1[4]=10;
        age1[5]=10;
        age1[6]=10;
;
        int[] x11=new int[2];
        int []x22=new int[2];
        int x33[]=new int[2];
        int  [] []b=new int[1][1];
        int []c[]=new int[1][1];

        System.out.println(age1[6]);


        /*int[] age = {12, 4, 5, 2, 5};
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        for(int a : age) {
            System.out.println(a);
        }

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        for (int number: numbers) {
            sum += number;
        }
        int arrayLength = numbers.length;

        average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);*/

        int[][][] twoDimensioanlArray=new int[2][2][2];
       /* twoDimensioanlArray[0][0]=1;
        twoDimensioanlArray[0][1]=2;
        twoDimensioanlArray[1][0]=3;
        twoDimensioanlArray[1][1]=4;*/
        System.out.println("2 dime:"+twoDimensioanlArray[1][1]);
        int[][][] twoDimensioanlArrayCLone=twoDimensioanlArray.clone();
        System.out.println("2 dime clone:"+twoDimensioanlArrayCLone[1][1]);

        System.out.println("size::"+twoDimensioanlArray.length);
        int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int carr[][]=arr.clone(); //clone

        for (int i=0; i<carr.length; i++){
            for (int j=0; j<carr.length; j++){
                System.out.print(carr[i][j] +" ");
            }
            System.out.println();

        }

        // create a 3d array
        int threeDimensioanlArray [ ] [ ] [ ] = new int [3] [3] [3];

        int[][][] test = {
                {
                 {1, -2, 3},
                 {2, 3, 4}},
                {
                    {-4, -5, 6, 9},
                     {1},
                     {2, 3}
                }   };
        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }


    }
}
