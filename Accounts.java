public class Accounts {
    Account[] accounts;


    public Accounts(Account[] accounts) {

        this.accounts = accounts;
    }

    public String toString() {
        String result = "";
        for (Account account : accounts) {
            result += account + "\n\n";

        }
        return result;
    }

    public void getBalanceOverLimit(double limit) {

        for (Account acc : accounts) {
            if (acc.balance > limit) {
                System.out.println("CLient with Iban: "+ acc.maskedIban() + ", has " + acc.balance+" € on his balance.\n");
            }
        }

    }

    public double accountBalanceSummary() {
        double temp = 0;
        for (Account acc : accounts) {
            temp += acc.balance;
        }
        return temp;
    }

}
