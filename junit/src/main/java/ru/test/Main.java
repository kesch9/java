package ru.test;

public class Main {
    public static void main(String[] args) {

        int res = Math.add(2,2);
        if (res == 4){
            System.out.println("OK");
        } else {
            System.out.println("Not Ok");
        }

        res = Math.add(0, 2);
        if (res != 4){
            System.out.println("OK");
        } else {
            System.out.println("Not Ok");
        }

    }
}