public class Main {

    public static void main(String[] args) {
        BankController bankAccount = new BankController(new BankView(), new BankModel());
        bankAccount.process();
    }
}
