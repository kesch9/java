package ru.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

    @Before
    public void before (){
        System.out.println("Before");
    }

    @Test
    public void test1(){
        System.out.println("test1");
        int res = Math.div(6, 3);
        Assert.assertEquals(2,res);
    }
    @Test
    public void test2(){
        System.out.println("test2");
        int res = Math.div(8, 2);
        Assert.assertEquals(4,res);
    }

    @Test(expected = ZeroException.class)
    public void testZero(){
        System.out.println("test3");
        int res = Math.div(8, 0);
    }

    @After
    public void after (){
        System.out.println("After");
    }

}
