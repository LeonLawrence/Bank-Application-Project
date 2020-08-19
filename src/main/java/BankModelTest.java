import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankModelTest {

        private BankModel model = new BankModel();

    @Test
    public void canWithdraw() {
        model.withdraw(100);
        assertEquals(-100, model.getBalance());
    }

    @Test
    public void canDeposit() {
        model.deposit(100);
        assertEquals(100, model.getBalance());
    }
}
