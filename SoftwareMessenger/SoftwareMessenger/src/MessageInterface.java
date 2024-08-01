public interface MessageInterface {
    String getSenderMessage();
    String getReceiverMessage();
    String getTextMessage();

    public MessageStatuses getMessageStatus();

    public void setMessageStatus(MessageStatuses status);


    //public void receiveMessage(MessageInterface message);
}
