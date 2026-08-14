
public class User implements Cloneable{

    private final int id;
    private String username;

    public User(int id, String username){
        this.id = id;
        this.username = username;
    }

    public int getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
