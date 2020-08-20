import javax.swing.*;
import java.awt.event.ActionListener;

class BankViewGUI extends JFrame {
    private JTextField inputTextField = new JTextField(10);
    private JButton depositButton = new JButton("Deposit");
    private JButton withdrawButton = new JButton("Withdraw");
    private JLabel resultsTextField = new JLabel("***");

    public BankViewGUI() {
        JPanel panel = new JPanel();
        this.setSize(400, 200);

        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(inputTextField);
        panel.add(resultsTextField);

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);
    }

    public int getAmountTextField() {
        return Integer.parseInt(inputTextField.getText());
    }

    public void setResultsLabel(int solution) {
        resultsTextField.setText(Integer.toString(solution));
    }

    public void depositButtonListener(ActionListener listenForCalcButton) {
        depositButton.addActionListener(listenForCalcButton);
    }

    public void withdrawButtonListener(ActionListener listenForCalcButton) {
        withdrawButton.addActionListener(listenForCalcButton);
    }

    public void inputTextFieldListener(ActionListener listenForCalcButton) {
        inputTextField.addActionListener(listenForCalcButton);
    }
}
