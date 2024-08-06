import java.util.ArrayList;
import java.util.HashSet;

public interface UserInterface {
    String getName();
    public void setName(String name);
    HashSet<UserInterface> getContactList();
    ArrayList<MessageInterface> getListOfMessages();
    public void addContact(UserInterface user);
    public void sentMessage(UserInterface receiver, String textMessage);
    public void receiveMessage(MessageInterface sender, String textMessage);

}
