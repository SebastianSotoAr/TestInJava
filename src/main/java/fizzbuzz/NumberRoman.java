package fizzbuzz;

public class NumberRoman
{
    public static String numberRoman(int n)
    {
        String str = "";
        for (int i = 0; i < Math.floorDiv(n, 1000); i++) {str += "M";}
        n %= 1000;
        if (n >= 500)
        {
            n -= 500;
            str += "D";
        }
        for (int i = 0; i < Math.floorDiv(n, 100); i++) {str += "C";}
        n %= 100;
        if (n >= 50)
        {
            n -= 50;
            str += "L";
        }
        for (int i = 0; i < Math.floorDiv(n, 10); i++) {str += "X";}
        n %= 10;
        if (n >= 5)
        {
            n -= 5;
            str += "V";
        }
        for (int i = 0; i < n; i++) {str += "I";}
        return str;
    }
}
