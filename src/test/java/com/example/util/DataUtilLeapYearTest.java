package com.example.util;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.Assert;

public class DataUtilLeapYearTest
{
    @Test
    public void return_true_when_year_is_divisible_by_400()
    {
        Assert.assertThat(DataUtil.isLeapYear(1600), CoreMatchers.is(true));
        Assert.assertThat(DataUtil.isLeapYear(2000), CoreMatchers.is(true));
        Assert.assertThat(DataUtil.isLeapYear(2400), CoreMatchers.is(true));
    }

    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_by_400()
    {
        Assert.assertThat(DataUtil.isLeapYear(1700), CoreMatchers.is(false));
        Assert.assertThat(DataUtil.isLeapYear(1800), CoreMatchers.is(false));
        Assert.assertThat(DataUtil.isLeapYear(1900), CoreMatchers.is(false));
    }

    @Test
    public void return_true_when_year_is_divisible_by_4_but_not_by_100()
    {
        Assert.assertThat(DataUtil.isLeapYear(1996), CoreMatchers.is(true));
        Assert.assertThat(DataUtil.isLeapYear(2004), CoreMatchers.is(true));
        Assert.assertThat(DataUtil.isLeapYear(2008), CoreMatchers.is(true));
    }

    @Test
    public void return_false_when_year_is_not_divisible_by_4()
    {
        Assert.assertThat(DataUtil.isLeapYear(2017), CoreMatchers.is(false));
        Assert.assertThat(DataUtil.isLeapYear(2018), CoreMatchers.is(false));
        Assert.assertThat(DataUtil.isLeapYear(2019), CoreMatchers.is(false));
    }
}