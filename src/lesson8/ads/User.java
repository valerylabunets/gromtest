package lesson8.ads;

public class User extends BaseEntity{
    //long id;
    String userName;
    String location;

    public User(long id, String userName, String location) {
        super(id);
        //this.id = id;
        this.userName = userName;
        this.location = location;
    }
}
