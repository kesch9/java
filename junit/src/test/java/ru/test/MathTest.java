package ru.test;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {

    @Test
    public void testAdd(){
        int res = Math.add(2,2);
        Assert.assertEquals(4,res);
    }
    @Test
    public void testAdd2(){
        int res = Math.add(0, 2);
        Assert.assertNotEquals(5,res);
    }

}
