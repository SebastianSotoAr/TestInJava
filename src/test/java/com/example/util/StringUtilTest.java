package com.example.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest
{
    @Test
    public void repeatStringOnce() throws IllegalAccessException {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeatStringMultipleTimes() throws IllegalAccessException {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeatStringZeroTimes() throws IllegalAccessException {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalAccessException.class)
    public void repeatStringNegativeTimes() throws IllegalAccessException {
        StringUtil.repeat("hola", -1);
    }

    @Test
    public void when_string_is_empty()
    {
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void when_string_is_null()
    {
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void when_string_is_one_space()
    {
        Assert.assertTrue(StringUtil.isEmpty(" "));
    }

    @Test
    public void when_string_is_not_empty()
    {
        Assert.assertFalse(StringUtil.isEmpty("i am not empty"));
    }
}