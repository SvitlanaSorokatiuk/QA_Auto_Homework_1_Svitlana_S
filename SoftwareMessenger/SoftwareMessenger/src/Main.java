//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User oksana = new User("Oksana");
        User ivan = new User("Ivan");
        User roman = new User("Roman");

        oksana.addContact("Ivan");
        oksana.addContact("Roman");

        ivan.addContact("Oksana");
        ivan.addContact("Roman");

        roman.addContact("Oksana");
        roman.addContact("Ivan");

    }
}