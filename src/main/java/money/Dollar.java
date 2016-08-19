package money;

/**
 * Created by pevangeli on 18/08/16.
 */
public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        this.amount *= multiplier;
    }
}
