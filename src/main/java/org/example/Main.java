package org.example;

public class Main {
    public static void main(String[] args) {
        final long universeAge = 13_000_000_000L;
        int humanityAge = 100_000;
        long universeAgeComparedHumanityAge = universeAge / humanityAge;
        System.out.println("переменная universeAge " + universeAge);
        System.out.println("переменная humanityAge " + humanityAge);
        System.out.println("переменная universeAgeComparedHumanityAge " + universeAgeComparedHumanityAge);
    }
}