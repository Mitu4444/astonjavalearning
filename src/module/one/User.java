package moduleOne;

import java.util.Optional;

public class User implements Cloneable {

    private final long id;
    private String username;

    public User(long id, String username) {
        this.id = id;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    protected Optional<User> clone() throws CloneNotSupportedException {
        return (Optional<User>) super.clone();
    }
}
