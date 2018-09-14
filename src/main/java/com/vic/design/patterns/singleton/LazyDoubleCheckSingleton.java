package com.vic.design.patterns.singleton;

public class LazyDoubleCheckSingleton {
    private static volatile LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("Hello lazy double check singleton");
    }

    public static void main(String[] args) {
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        instance.sayHello();

    }
}
