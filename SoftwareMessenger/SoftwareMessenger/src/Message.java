public class Message implements MessageInterface {
    private UserInterface sender;
    private UserInterface receiver;
    private String textMessage;
    private MessageStatuses status;

    public Message (UserInterface sender, UserInterface receiver, String textMessage) {
        this.setSender(sender);
        this.setReceiver(receiver);
        this.setTextMessage(textMessage);
    }

    @Override
    public UserInterface getSender() {
        return this.sender;
    }

    @Override
    public UserInterface getReceiver() {
        return this.receiver;
    }

    @Override
    public void setSender(UserInterface sender) {
        this.sender = sender;
    }

    @Override
    public void setReceiver(UserInterface receiver) {
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

   @Override
   public String toString() {
      return "\nMessage{" +
              "sender=" + sender.getName() +
              ", receiver=" + receiver.getName() +
             ", textMessage='" + textMessage + '\'' +
          ", status=" + status +
              '}';
    }
}
