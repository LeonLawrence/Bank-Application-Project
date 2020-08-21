public class Main {

    public static void main(String[] args) {
        BankViewJFrame theView = new BankViewJFrame();

        BankModel theModel = new BankModel();

        BankControllerGUI theController = new BankControllerGUI(theView, theModel);

        theView.setVisible(true);
    }
}
