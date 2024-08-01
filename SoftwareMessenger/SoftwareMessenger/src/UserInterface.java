import java.util.ArrayList;
import java.util.HashSet;

public interface UserInterface {
    String getUserName();
    HashSet<String> getContactList();
    ArrayList<String> getListOfMessages();

    void addContact(String contactName);

    void sentMessage(MessageInterface receiverMessage, String textMessage);

    void receiveMessage(MessageInterface senderMessage, String textMessage);

}
