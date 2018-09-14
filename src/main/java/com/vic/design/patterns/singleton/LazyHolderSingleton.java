package com.vic.design.patterns.singleton;

public class LazyHolderSingleton {
    private LazyHolderSingleton() {
    }

    public static LazyHolderSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyHolderSingleton INSTANCE = new LazyHolderSingleton();
    }

    public void sayHello() {
        System.out.println("Hello lazy holder singleton");
    }

    public static void main(String[] args) {
        LazyHolderSingleton instance = LazyHolderSingleton.getInstance();
        instance.sayHello();
    }
}
