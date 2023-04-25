package fizzbuzz;

public class FizzBuzz
{
    public static String fizzbuzz(int n)
    {
        String str = "";
        if (n % 3 == 0) {str += "Fizz";}
        if (n % 5 == 0) {str += "Buzz";}
        if (str == "") {str += n;}
        return str;
    }
}
