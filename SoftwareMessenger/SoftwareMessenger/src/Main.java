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

        katia.sentMessage(ivan, "Hello, Ivan!");
        ivan.sentMessage(katia, "Hello, Katia!");
        katia.sentMessage(ivan, "How are you?");
        ivan.sentMessage(katia, "I’m fine!");

        System.out.print("\nСписок повідомлень Каті");
        for (Message message : katia.getListOfMessages()) {
            System.out.print(message);
        }

        System.out.print("\nСписок повідомлень Івана");
        for (Message message : ivan.getListOfMessages()) {
            System.out.print(message);
        }

        katia.readMessage();

        System.out.print("\nСписок повідомлень Каті");
        for (Message message : katia.getListOfMessages()) {
            System.out.print(message);
        }


                }
}