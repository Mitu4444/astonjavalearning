package moduleOne;

public class Main {

    public static void main(String[] args) throws Exception {

        User user1 = new User(1, "one");
        User user2 = new User(1, "two");

        Message msg = new Message("123", user1, user2);

        msg.getSender().setUsername("three");

        user1.setUsername("three");

    }
}

