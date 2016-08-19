import junit.framework.TestCase;
import money.Dollar;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by pevangeli on 18/08/16.
 */
public class MoneyTest extends TestCase {

    @Test
    public void testMultiplication() throws Exception {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertThat(product.amount, is(10));

        product = five.times(3);
        assertThat(product.amount, is(15));
    }
}
