import java.util.ArrayList;
import java.util.HashSet;

public class User implements UserInterface{

    private String userName;
    HashSet<String> contactList = new HashSet<>();
    ArrayList<String> listOfMessages = new ArrayList<>();

    public User(String userName) {
        this.userName = userName;
        //this.contactList =  new HashSet<>();
        //this.listOfMessages = new ArrayList<Message>();
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public HashSet<String> getContactList() {
        return contactList;
    }

    @Override
    public ArrayList<String> getListOfMessages() {
        return listOfMessages;
    }

    @Override
    public void addContact(String contactName) {
        contactList.add(contactName);
        System.out.println("Контакт додано");
    }

    @Override
    public void sentMessage(MessageInterface receiverMessage, String textMessage) {
        Message message = new Message (this.userName, receiverMessage.getReceiverMessage(), textMessage);
        message.setMessageStatus(MessageStatuses.SENT);
        listOfMessages.add(String.valueOf(message));
        //receiverMessage.getTextMessage(String userName, String textMessage);
    }

    @Override
    public void receiveMessage(MessageInterface senderMessage, String textMessage) {
        Message message = new Message(this.userName, senderMessage.getSenderMessage(), textMessage);
        listOfMessages.add(String.valueOf(message));
        message.setMessageStatus(MessageStatuses.RECEIVED);
        System.out.print("Отримано повідомлення від " + senderMessage);
    }
}
