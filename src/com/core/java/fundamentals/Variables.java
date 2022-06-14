package com.core.java.fundamentals;

public class Variables {

    public String variable; // Declared Instance Variable
    public static String staticVariable = "static variable ";

    public Variables()
    { // Default Constructor

        this.variable = "local variable"; // initializing Instance Variable
    }
    public void testVariablesAccess(){

        System.out.println("testVariablesAccess::"+Variables.staticVariable);
        System.out.println("non static variable access in non static method::"+variable);
    }
    public static  void  testStaticVariablesAccess(){
       // public static String staticString="test static string";
        new Variables().testVariablesAccess();
        System.out.println("testVariablesAccess::"+staticVariable);
        System.out.println("non static testVariablesAccess::"+new Variables().variable);
    }
    public static void main(String[] args)
    {
        int var = 10; // Declared a Local Variable
        // This variable is local to this main method only
        System.out.println(" main method local Variable: " + var);
        // Object Creation
        Variables name = new Variables();
        // Displaying O/P
        System.out.println(" name is: " + name.variable);
        System.out.println(" Name is : "+Variables.staticVariable);
        name.testVariablesAccess();
        testStaticVariablesAccess();
    }
}
