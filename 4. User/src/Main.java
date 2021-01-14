public class Main {
    public static void main(String[] args) {
        User younes = new User("Younes","Karim","younes@cph.dk", "12345678");
        User peter = new User("Hans","Hanson","Hans@cph.dk", "12345678");
        User jesper = new User("Jesper","Jesperson","Jesper@cph.dk", "12345678");
        User jesper1 = new User("Jesper","Jespperson","Jesper@cph.dk", "12345678");

        UserList users = new UserList();

        users.addUser(younes);
        users.addUser(peter);
        users.addUser(jesper);
        users.addUser(jesper1);

        System.out.println("Unsorted: " + users.toString());
        System.out.println("Sorted: " + users.sortingMachine());

    }
}
