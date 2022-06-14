package com.core.java.flowcontrols;

public class TestContinue {
    public static void main(String[] args) {
      /*   0 1 2 3  0-0
            1%2 no
            2 -yes
                    3-no*/

        for(int i=0;i<=3;i++) {

                if (i % 2 == 0) {
                    System.out.println("inside if block::" + i);
                    continue;
                } else {
                    System.out.println("test else block:" + i);
                }
                System.out.println("i::" + i);
        }
    }
}
