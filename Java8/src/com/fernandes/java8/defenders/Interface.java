package com.fernandes.java8.defenders;

public interface Interface {
     default String defaultMethod() {
        return "Default Method";
    }

    static String staticMethod() {
        return "Static Method";
    }
}
