package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest
{
    @Test
    public void test_3() {assertEquals("Fizz", FizzBuzz.fizzbuzz(3));}

    @Test
    public void test_6() {assertEquals("Fizz", FizzBuzz.fizzbuzz(6));}

    @Test
    public void test_5() {assertEquals("Buzz", FizzBuzz.fizzbuzz(5));}

    @Test
    public void test_10() {assertEquals("Buzz", FizzBuzz.fizzbuzz(10));}

    @Test
    public void test_15() {assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));}

    @Test
    public void test_30() {assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));}

    @Test
    public void test_2() {assertEquals("2", FizzBuzz.fizzbuzz(2));}

    @Test
    public void test_16() {assertEquals("16", FizzBuzz.fizzbuzz(16));}
}