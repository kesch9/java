package ru.test;

public  class Math {

    public static int div (int x, int y) throws ZeroException {

        if (y==0){
            throw new ZeroException();
        }
        return x/y;
    }
}