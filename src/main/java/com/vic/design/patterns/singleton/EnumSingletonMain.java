package com.vic.design.patterns.singleton;

public class EnumSingletonMain {
    public enum EnumSingleton {
        INSTANCE;

        public void sayHello() {
            System.out.println("Hello enum singleton!");
        }
    }

    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.sayHello();
    }
}
