public class Main {

    public static void main(String[] args) {

        Account account =
                new Account("Adarsh", 1234, 10000);

        ATM atm = new ATM(account);

        if (atm.login()) {
            atm.showMenu();
        }
    }
}