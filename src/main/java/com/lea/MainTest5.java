package com.lea;

/**
 * Created by home on 16.01.17.
 */
public class MainTest5 {
    public static void main(String[] args) {
        System.out.println("страт, первая модификация");

        System.out.printf("еще коммент в старте");
        System.out.println("");
        print();


        display();

        compute();
    }

    public static void print () {
        System.out.printf("добавлем ещё одну ветку");
    }

    public static void display () {
        System.out.println("добавили метод display");
    }

    public static void compute () {
        System.out.printf("добавили  метод compute");
    }
}
