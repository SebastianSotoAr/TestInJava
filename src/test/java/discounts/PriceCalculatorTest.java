package discounts;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PriceCalculatorTest
{
    private PriceCalculator calculator = new PriceCalculator();

    @Test
    public void total_zero_when_there_arent_prices() {assertThat(calculator.getTotal(), is(0.0));}

    @Test
    public void total_is_the_sum_of_prices() {
        calculator.addPrice(10.2);
        calculator.addPrice(15.5);
        assertThat(calculator.getTotal(), is(25.7));
    }

    @Test
    public void apply_discount_to_prices() {
        calculator.addPrice(12.5);
        calculator.addPrice(17.5);
        calculator.setDiscount(50);
        assertThat(calculator.getTotal(), is(15.0));
    }
}