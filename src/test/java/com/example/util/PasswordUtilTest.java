package com.example.util;

import org.junit.Assert;
import org.junit.Test;
import com.example.util.PasswordUtil.SecurityLevel;

public class PasswordUtilTest
{
    @Test
    public void weak_when_has_less_than_8_letters()
    {
        Assert.assertEquals(SecurityLevel.WEAK, PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_only_letters()
    {
        Assert.assertEquals(SecurityLevel.WEAK, PasswordUtil.assessPassword("abcdefghijk"));
    }

    @Test
    public void medium_when_has_letters_and_numbers()
    {
        Assert.assertEquals(SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcd1234efghi"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols()
    {
        Assert.assertEquals(SecurityLevel.STRONG, PasswordUtil.assessPassword("abcd123!"));
    }
}