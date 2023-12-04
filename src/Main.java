/*Создать класс Account (счет). У сета должны быть следующие поля
owner (владелец), iban (номер счета), balance, dateOfContract (дата истечения контракта).
Owner - сам по себе класс (firstName, lastName, birthday) Для отражения дат используем класс MyDate созданный ранее.
В каждом классе должен быть конструктор и метод toString.

создайте класс Accounts который должен управлять всеми счетами. Кроме метода toString в этом классе должны быть методы:

метод, который выводит на экран все счета, с балансом меньше заданного числа
метод, который считает сумму всех остатков, на всех счетах банка*/


public class Main {
    public static void main(String[] args) {

        //region Client Accounts
        Account[] clients = {
                new Account(321321321, 23323.21,
                        new Owner("John", "Doe", new MyDate(1, 6, 1968)),
                        new MyDate(23, 4, 2025)),

                new Account(675575676, 323.15,
                        new Owner("Samantha", "Jones", new MyDate(17, 2, 1975)),
                        new MyDate(13, 6, 2021)),

                new Account(123234353, 723323.78,
                        new Owner("Travis", "Drinkwater", new MyDate(25, 12, 1986)),
                        new MyDate(3, 7, 2015)),

                new Account(564774555, 213323.9,
                        new Owner("Amanda", "Smith", new MyDate(12, 3, 1992)),
                        new MyDate(18, 8, 2064)),

                new Account(346465335, 656323.5,
                        new Owner("Mike", "Rotch", new MyDate(30, 1, 2000)),
                        new MyDate(30, 9, 2035))
        };
        Accounts accounts = new Accounts(clients);

        

        //endregion

        System.out.println(accounts);
        accounts.getBalanceOverLimit(50000);
        System.out.println("All the finances after the count - "+accounts.accountBalanceSummary()+" €");


    }
}
