/*Создать класс Account (счет). У сета должны быть следующие поля
owner (владелец), iban (номер счета), balance, dateOfContract (дата истечения контракта).*/

public class Account {
    String owner;

    String iban;
    double balance;
    MyDate dateOfContract;

    public Account(String iban, double balance, Owner owner, MyDate date) {

        this.iban = iban;
        this.balance = balance;
        this.dateOfContract = date;
        this.owner = owner.toString();
    }


    public String maskedIban() {
        String temp = "";
        String maskedIban = "";

        for (int i = 4; i < iban.length() - 3; i++) {
            temp += '*';
            maskedIban = iban.substring(0, 4) + temp + iban.substring(iban.length() - 2);
        }
        return maskedIban;
    }

    public String secureString() {
        int len = iban.length();
        String secureIban = "";
        if (len > 6) {
            secureIban = maskedIban();
        } else {
            secureIban = iban;
        }
        return secureIban;

    }

    public String toString() {
        return this.owner + "Iban: " + secureString() +
                "\n" + "Account balance: " + this.balance +
                "\n" + "Expires on: " + this.dateOfContract.toString();

    }
}



