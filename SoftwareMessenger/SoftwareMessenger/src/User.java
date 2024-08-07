import java.util.ArrayList;
import java.util.HashSet;

public class User implements UserInterface {

    private String name;
    HashSet<UserInterface> contacts = new HashSet<>();
    ArrayList<Message> massages = new ArrayList<>();

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
    public ArrayList<Message> getListOfMessages() {
        return massages;
    }

    @Override
    public void addContact(UserInterface user) {
        contacts.add(user);
        System.out.println("Користувачу " + name + " додано контакт " + user.getName());
    }

    @Override
    public void sentMessage(UserInterface receiver, String textMessage) {
        Message message = new Message(this, receiver, textMessage);
        //massages.add(message);
        //message.setStatus(MessageStatuses.SENT);
        receiver.receiveMessage(message);
        System.out.print("\nПовідомлення надіслано користувачу " + receiver.getName());
    }

    @Override
    public void receiveMessage(Message message) {
        massages.add(message);
        message.setStatus(MessageStatuses.RECEIVED);
        //System.out.print("Отримано повідомлення від користувача " + message.getSender());
    }

    public void readMessage() {
        for (Message massage : massages) {
            if (massage.getStatus() == MessageStatuses.RECEIVED) {
                massage.setStatus(MessageStatuses.READ);
                //System.out.println("Повідомлення прочитано");
            }
        }
    }
}

