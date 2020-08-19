    import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankControllerTest {
    BankController bankController = new BankController(new BankView(), new BankModel());

        @Test
        public void canDisplayResults() {
            assertEquals(0, bankController.displayResult());
        }

        @Test
        public void canExecuteDeposit() {
            bankController.executeDeposit(100);
            assertEquals(100, bankController.displayResult());
        }

    @Test
    public void canExecuteWithdraw() {
        bankController.executeDeposit(200);
        bankController.executeWithdraw(100);
        assertEquals(100, bankController.displayResult());

    }
    }


