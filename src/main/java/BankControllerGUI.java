import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankControllerGUI {
    private BankViewGUI theViewGUI;
    private BankModel theModel;

    public BankControllerGUI(BankViewGUI theViewGUI, BankModel theModel) {
        this.theViewGUI = theViewGUI;
        this.theModel = theModel;

        this.theViewGUI.depositButtonListener(new BankListener());
        this.theViewGUI.withdrawButtonListener(new BankListener());
        this.theViewGUI.inputTextFieldListener(new BankListener());
    }

    class BankListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());

            int amount = theViewGUI.getAmountTextField();

            if (e.getActionCommand().equals("Deposit")) {
                theModel.deposit(amount);
                theViewGUI.setResultsLabel(theModel.getBalance());
            } else if (e.getActionCommand().equals("Withdraw")) {
                if (theModel.getBalance() - amount < amount) {
                    System.out.println("NOT ENOUGH FUNDS, YOUR CURRENT ACCOUNT BALANCE IS: £");
                    theViewGUI.setResultsLabel(theModel.getBalance());
                } else if (theModel.getBalance() > 0) {
                    System.out.println("WITHDRAW SUCCESSFUL");
                    theModel.withdraw(amount);
                    theViewGUI.setResultsLabel(theModel.getBalance());
                }
            }
        }
    }
}



