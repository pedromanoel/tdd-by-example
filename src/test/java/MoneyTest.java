import money.Dollar;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class MoneyTest {

    @Test
    public void testMultiplication() throws Exception {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(product.amount, is(10));

        product = five.times(3);
        assertThat(product.amount, is(15));
    }

    @Test
    public void testEquality() throws Exception {
        assertThat(new Dollar(5), is(equalTo(new Dollar(5))));
        assertThat(new Dollar(5), is(not(equalTo(new Dollar(6)))));
    }
}
