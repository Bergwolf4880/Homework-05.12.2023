/*Owner - сам по себе класс (firstName, lastName, birthday) Для отражения дат используем класс MyDate созданный ранее.*/
public class Owner {
    String firstName;
    String lastName;
    MyDate birthday;

    public Owner(String firstName, String lastName, MyDate date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = date;
    }

    public String toString() {
        return firstName + " " + this.lastName + ", birthday on " + this.birthday.toString() + "\n";
    }

}
