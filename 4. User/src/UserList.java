import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UserList {
    private final List<User> users;

    public UserList() {
        users = new ArrayList<>();
    }

    public void addUser(User u){
        for (User us: users) {
            if (u.getEmail().equals(us.getEmail())) {
                System.out.println("Not going to add since user email already exists!");
                return;
            }
        }
        users.add(u);
        System.out.println("User added!");
    }

    public ArrayList<User> sortingMachine() {
        ArrayList<User> sA = new ArrayList<>(users);
        Collections.sort(sA, new Sort());
        return sA;
    }

    @Override
    public String toString() {
        return "Users=" + users + '}';
    }
}

class Sort implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        int a = o1.getName().compareToIgnoreCase(o2.getName());
        if (a != 0){
            return a;
        }
        return o1.getLastName().compareToIgnoreCase(o2.getLastName());
    }
}