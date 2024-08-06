public interface MessageInterface {
    User getSender();
    User getReceiver();
    void  setSender(User sender);
    void setReceiver(User receiver);
    String getTextMessage();
    void setTextMessage(String text);
    MessageStatuses getStatus();
    void setStatus(MessageStatuses status);

}
