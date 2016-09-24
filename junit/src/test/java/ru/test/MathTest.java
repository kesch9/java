package ru.test;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {

    @Test
    public void test1(){
        int res = Math.div(6, 3);
        Assert.assertEquals(2,res);
    }
    @Test
    public void test2(){
        int res = Math.div(8, 2);
        Assert.assertEquals(4,res);
    }

    @Test(expected = ZeroException.class)
    public void testZero(){
        int res = Math.div(8, 0);
    }

}
