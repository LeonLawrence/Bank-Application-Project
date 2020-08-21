import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BankListener implements ActionListener {
    private BankViewJFrame bankViewJframe;
    private BankModel bankModel;

    public BankListener(BankViewJFrame bankViewJframe, BankModel bankModel) {
        this.bankViewJframe = bankViewJframe;
        this.bankModel = bankModel;
    }

    public void actionPerformed(ActionEvent e) {

        int amount = bankViewJframe.getAmountTextField();

        if (e.getActionCommand().equals("Deposit")) {
            bankModel.deposit(amount);
            bankViewJframe.setResultsLabel(bankModel.getBalance());
        } else if (e.getActionCommand().equals("Withdraw")) {
            withdrawOverdraftProtection(amount);

        }
    }

    public void withdrawOverdraftProtection(int amount) {
        if (bankModel.getBalance() < amount) {
            bankViewJframe.setResultsLabel(bankModel.getBalance());
        } else if (bankModel.getBalance() > 0) {
            bankModel.withdraw(amount);
            bankViewJframe.setResultsLabel(bankModel.getBalance());
        }
    }
}
