import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankControllerGUI {
    private BankViewJFrame theViewGUI;
    private BankModel theModel;
    private int amount = 0;

    public BankControllerGUI(BankViewJFrame theViewGUI, BankModel theModel) {
        this.theViewGUI = theViewGUI;
        this.theModel = theModel;

        this.theViewGUI.depositButtonListener(new BankListener());
        this.theViewGUI.withdrawButtonListener(new BankListener());
        this.theViewGUI.inputTextFieldListener(new BankListener());
    }

    class BankListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            amount = theViewGUI.getAmountTextField();

            if (e.getActionCommand().equals("Deposit")) {
                theModel.deposit(amount);
                theViewGUI.setResultsLabel(theModel.getBalance());
            } else if (e.getActionCommand().equals("Withdraw")) {
                withdrawOverdraftProtection();

            }
        }

        public void withdrawOverdraftProtection() {
            if (theModel.getBalance() < amount) {
                theViewGUI.setResultsLabel(theModel.getBalance());
            } else if (theModel.getBalance() > 0) {
                theModel.withdraw(amount);
                theViewGUI.setResultsLabel(theModel.getBalance());
            }
        }
    }
}



