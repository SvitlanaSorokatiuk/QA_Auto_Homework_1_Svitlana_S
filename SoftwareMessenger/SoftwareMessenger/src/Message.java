public class Message implements MessageInterface{
    String senderMessage;
    String receiverMessage;
    String textMessage;
    MessageStatuses messageStatus;

    public Message (String senderMessage, String receiverMessage, String textMessage) {
        this.senderMessage = senderMessage;
        this.receiverMessage = receiverMessage;
        this.textMessage = textMessage;
        setMessageStatus(MessageStatuses.SENT);
    }

    @Override
    public String getSenderMessage() {
        return senderMessage;
    }

    @Override
    public String getReceiverMessage() {
        return receiverMessage;
    }

    @Override
    public String getTextMessage() {
        return textMessage;
    }

    @Override
    public MessageStatuses getMessageStatus() {
        return messageStatus;
    }

    @Override
    public void setMessageStatus(MessageStatuses status) {
        this.messageStatus = status;
    }

    };





