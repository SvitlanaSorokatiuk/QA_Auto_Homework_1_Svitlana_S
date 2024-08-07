public interface MessageInterface {
    UserInterface getSender();
    UserInterface getReceiver();
    void  setSender(UserInterface sender);
    void setReceiver(UserInterface receiver);
    String getTextMessage();
    void setTextMessage(String text);
    MessageStatuses getStatus();
    void setStatus(MessageStatuses status);

}
