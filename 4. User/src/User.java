import java.util.Objects;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String phone;

    public User(String name, String lastName, String email, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public User(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // undersøger om det er det samme object (samme instans)
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getEmail().equals(user.getEmail()); // undersøger om den email vi fik ind er den samme som nuværende email
    }
    @Override
    public int hashCode() {
        return Objects.hash(getEmail());
    }
}
