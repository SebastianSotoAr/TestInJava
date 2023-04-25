package discounts;

public class PriceCalculator
{
    private double total = 0;

    public double getTotal() {return total;}

    public void addPrice(double price) {total += price;}

    public void setDiscount(int discount) {total /= 100/discount;}
}
