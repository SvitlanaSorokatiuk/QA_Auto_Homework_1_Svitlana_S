//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        User katia = new User("Katia");
        User ivan = new User("Ivan");
        User petro = new User("Petro");

        katia.addContact(ivan);
        katia.addContact(petro);
        ivan.addContact(katia);
        ivan.addContact(petro);

        System.out.print(katia);
        System.out.print(ivan);
        System.out.print(petro);

        //Message mes = new Message("katia", "ivan", "Hello!");
        //katia.listOfMessages;



    }
}