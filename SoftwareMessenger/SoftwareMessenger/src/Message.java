public class Message implements MessageInterface {
    private User sender;
    private User receiver;
    private String textMessage;
    private MessageStatuses status;

    public Message (User sender, User receiver, String textMessage) {
        this.setSender(sender);
        this.setReceiver(receiver);
        this.setTextMessage(textMessage);
    }


    @Override
    public User getSender() {
        return this.sender;
    }

    @Override
    public User getReceiver() {
        return this.receiver;
    }

    @Override
    public void setSender(User sender) {
        this.sender = sender;
    }

    @Override
    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    @Override
    public String getTextMessage() {
        return this.textMessage;
    }

    @Override
    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    @Override
    public MessageStatuses getStatus() {
        return status;
    }

    @Override
    public void setStatus(MessageStatuses status) {
        this.status = status;
    }
}