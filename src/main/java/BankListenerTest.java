import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.awt.event.ActionEvent;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BankListenerTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();
    @Mock
    private BankViewJFrame bankView;
    @Mock
    private ActionEvent actionEvent;

    private BankModel bankModel = new BankModel();
    private BankListener bankListener;

    @Before
    public void setUp() {
        bankModel = new BankModel();
        bankListener = new BankListener(bankView, bankModel);
    }

    @Test
    public void canDeposit() {
        when(bankView.getAmountTextField()).thenReturn(100);
        when(actionEvent.getActionCommand()).thenReturn("Deposit");
        bankListener.actionPerformed(actionEvent);
        assertEquals(100, bankModel.getBalance());
        verify(bankView).setResultsLabel(100);
    }

    @Test
    public void overdraftProtection() {
        when(bankView.getAmountTextField()).thenReturn(50);
        when(actionEvent.getActionCommand()).thenReturn("Withdraw");
        bankListener.actionPerformed(actionEvent);
        assertEquals(0, bankModel.getBalance());
        verify(bankView).setResultsLabel(0);
    }

    @Test
    public void canWithdraw() {
        bankModel.deposit(100);
        when(bankView.getAmountTextField()).thenReturn(50);
        when(actionEvent.getActionCommand()).thenReturn("Withdraw");
        bankListener.actionPerformed(actionEvent);
        assertEquals(50, bankModel.getBalance());
        verify(bankView).setResultsLabel(50);
    }
}