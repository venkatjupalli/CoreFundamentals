package com.core.java.lang;

public final class ImmutableClass {
    // private class members
    private final String name;
    private final int date;

    ImmutableClass(String name, int date) {
        this.name = name;
        this.date = date;
    }
    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

}

class Main {
    public static void main(String[] args) {

        // create object of Immutable
        ImmutableClass obj = new ImmutableClass("ImmutableObject", 2011);
        ImmutableClass obj1 = new ImmutableClass("ImmutableObject", 2011);
        ImmutableClass obj2 = new ImmutableClass("ImmutableObject", 2012);
        System.out.println("Name: " + obj.getName());
        System.out.println("Date: " + obj.getDate());
        System.out.println("hashcode: " + obj.hashCode()+":"+obj1.hashCode()+":"+obj2.hashCode());

    }
}
