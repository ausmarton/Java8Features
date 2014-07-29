package com.fernandes.java8.defenders;

// New Defender methods introduced in Java8
public class Main {
    public static void main(String[] args) {
        ConcreteImplementation concreteImplementation = new ConcreteImplementation();

        System.out.println(concreteImplementation.defaultMethod());

        BasicImplementation basicImplementation = new BasicImplementation();

        System.out.println(basicImplementation.defaultMethod());

        System.out.println(Interface.staticMethod());
    }

}
