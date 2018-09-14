package com.vic.design.patterns.singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello eager singleton!");
    }

    public static void main(String[] args) {
        EagerSingleton instance = EagerSingleton.getInstance();
        instance.sayHello();
    }
}
