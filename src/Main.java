public class Main {

    public static void main(String[] args) throws Exception {

        //Test immutable class
        User user1 = new User(1, "one");
        User user2 = new User(1, "two");

        Message msg = new Message("123", user1, user2);

        //Check changes in message
        msg.getSender().setUsername("three");

        //Check changes in user
        user1.setUsername("three");

    }
}

