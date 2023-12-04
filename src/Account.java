/*Создать класс Account (счет). У сета должны быть следующие поля
owner (владелец), iban (номер счета), balance, dateOfContract (дата истечения контракта).*/

import java.util.Currency;

public class Account {
    String owner;
    long iban;
    double balance;
    MyDate dateOfContract;

    public Account(long iban, double balance, Owner owner, MyDate date) {

        this.iban = iban;
        this.balance = balance;
        this.dateOfContract = date;
        this.owner = owner.toString();
    }

    public String toString() {
        return this.owner + "Iban: " + this.iban +
                "\n" + "Account balance: " + this.balance +
                "\n" + "Expires on: " + this.dateOfContract.toString();

    }
}



