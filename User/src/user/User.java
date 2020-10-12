package user;

import java.util.HashSet;
import java.util.Set;

public class User {

    String username;
    String password;
    int age;
    Set<Integer> orderIDs;


    public User(String customUserName, String customPassword, int customAge, Set<Integer> orderIDs) {
        this.username = customUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }

    public static void main(String[] args) {
        Set a = new HashSet();
        a.add(1212);
        User kathryn = new User("Agnes", "password", 10, a);

    }
}
