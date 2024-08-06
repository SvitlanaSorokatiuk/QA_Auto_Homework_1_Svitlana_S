import java.util.ArrayList;
import java.util.HashSet;

public class User implements UserInterface{

    private String name;
    HashSet<UserInterface> contacts = new HashSet<>();
    ArrayList<MessageStatuses> massages = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public HashSet<UserInterface> getContactList() {
        return contacts;
    }

    @Override
    public ArrayList<Message> messages() {
        return messages();
    }

    @Override
    public void addContact(UserInterface user) {
        contacts.add(user);
        //System.out.println("Користувачу " + name + " додано контакт " + user);
    }

    @Override
    public void sentMessage(UserInterface receiver, String textMessage) {
        if (receiver instanceof User) {
            User recepient = (User) receiver;
        } else {
            throw new IllegalArgumentException("Помилка відправлення повідомлення");
        }
        Message messsage = new Message (this, recepient, textMessage);
        receiver.receiveMessage(messsage);
        //message.setStatus(MessageStatuses.SENT);
        //massages.add(message);
        //receiverMessage.getTextMessage(String userName, String textMessage);
    }

    @Override
    public void receiveMessage(MessageInterface sender, String text) {
        Message message = new Message(this.name, sender.getSender(), text);
        messages().add(message);
        message.setStatus(MessageStatuses.RECEIVED);
        System.out.print("Отримано повідомлення від " + sender);
    }

    @Override
    public String toString() {
        System.out.print("\nІм’я користувача: " + this.name);
        System.out.print("\nСписок контактів користувача: ");
        this.contacts.forEach(contact -> System.out.print(" " + contact.getName()));
        return "\n======";
    }
}
