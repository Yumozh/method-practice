package com.pluralsight;

public class Hello {
    public static void main(String[] args) {
        sayHello();
        sayGoodbye();
        sayGoodMorning();
    }

    private static void sayHello(){
        System.out.println("Hello, World!");
    }

    private static void sayGoodbye(){
        System.out.println("Goodbye!");
    }

    private static void sayGoodMorning(){
        System.out.println("Good morning!");
    }
}
