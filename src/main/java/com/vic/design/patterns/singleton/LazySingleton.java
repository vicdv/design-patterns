package com.vic.design.patterns.singleton;

public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public synchronized static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello lazy singleton!");
    }

    public static void main(String[] args) {
        LazySingleton instance = LazySingleton.getInstance();
        instance.sayHello();
    }
}
