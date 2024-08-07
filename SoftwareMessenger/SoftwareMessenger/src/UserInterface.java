import java.util.ArrayList;
import java.util.HashSet;

public interface UserInterface {
    String getName();
    void setName(String name);
    HashSet<UserInterface> getContactList();
    ArrayList<Message> getListOfMessages();
    void addContact(UserInterface user);
    void sentMessage(UserInterface receiver, String textMessage);
    void receiveMessage(Message message);
}
