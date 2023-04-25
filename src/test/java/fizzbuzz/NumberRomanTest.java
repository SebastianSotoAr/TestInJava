package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;
import static fizzbuzz.NumberRoman.*;

public class NumberRomanTest
{
    @Test
    public void test_1() {assertEquals("I", numberRoman(1));}

    @Test
    public void test_2() {assertEquals("II", numberRoman(2));}

    @Test
    public void test_3() {assertEquals("III", numberRoman(3));}

    @Test
    public void test_5() {assertEquals("V", numberRoman(5));}

    @Test
    public void test_6() {assertEquals("VI", numberRoman(6));}

    @Test
    public void test_7() {assertEquals("VII", numberRoman(7));}

    @Test
    public void test_10() {assertEquals("X", numberRoman(10));}

    @Test
    public void test_11() {assertEquals("XI", numberRoman(11));}

    @Test
    public void test_15() {assertEquals("XV", numberRoman(15));}

    @Test
    public void test_16() {assertEquals("XVI", numberRoman(16));}

    @Test
    public void test_50() {assertEquals("L", numberRoman(50));}

    @Test
    public void test_51() {assertEquals("LI", numberRoman(51));}

    @Test
    public void test_55() {assertEquals("LV", numberRoman(55));}

    @Test
    public void test_56() {assertEquals("LVI", numberRoman(56));}

    @Test
    public void test_60() {assertEquals("LX", numberRoman(60));}

    @Test
    public void test_70() {assertEquals("LXX", numberRoman(70));}

    @Test
    public void test_80() {assertEquals("LXXX", numberRoman(80));}

    @Test
    public void test_81() {assertEquals("LXXXI", numberRoman(81));}

    @Test
    public void test_85() {assertEquals("LXXXV", numberRoman(85));}

    @Test
    public void test_86() {assertEquals("LXXXVI", numberRoman(86));}

    @Test
    public void test_126() {assertEquals("CXXVI", numberRoman(126));}

    @Test
    public void test_2507() {assertEquals("MMDVII", numberRoman(2507));}
}