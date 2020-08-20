public class Main {

    public static void main(String[] args) {
        BankViewGUI theView = new BankViewGUI();

        BankModel theModel = new BankModel();

        BankControllerGUI theController = new BankControllerGUI(theView, theModel);

        theView.setVisible(true);
    }
}
