public final class Message {

    private final String text;
    private final long sendingTime;
    private final User sender;
    private final User recipient;

    public Message(String text, User sender, User recipient) {

        this.text = text;
        this.sendingTime = System.currentTimeMillis();
        try {
            this.sender = sender.clone().orElseThrow();
            this.recipient = recipient.clone().orElseThrow();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

    public String getText() {
        return text;
    }

    public long getSendingTime() {
        return sendingTime;
    }

    public User getSender() {
        try {
            return sender.clone().orElseThrow();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

    public User getRecipient() {
        try {
            return recipient.clone().orElseThrow();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
