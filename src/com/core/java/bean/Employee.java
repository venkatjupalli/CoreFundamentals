package com.core.java.bean;

public class Employee {
   String empName;
   int age;
   static String companyName="xxx";

    public Employee(String empName) {
        this.empName = empName;
        this.empName="NAME";
        System.out.println("name const");

    }
   private Employee(int age){
        this("Venkat");
        this.age=age;
   System.out.println("age const");
    }

    public Employee(){
       //super();
         this(20);
        System.out.println("defa const");
        add(this);
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyName() {
        return companyName;
    }

  /*  public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }*/
  /*public static void main(String[] args) {
      Employee e=new Employee("",20);
  }*/

    public void add(Employee e){
        System.out.println(e.getAge()+"--"+e.getEmpName()+"-"+e.getCompanyName());
    }
}
