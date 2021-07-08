package ua.lviv.lgs.lesson21.lecture;

public class User {
    @UserSocial("great name")
    private String firstName;
    @UserSocial("Your last name is funny")
    private String lastName;
    @UserSocial("your id")
    private int id;
    @UserSocial("your access")
    private boolean access;

    public User(String firstName, String lastName, int id, boolean access) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.access = access;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", access=" + access +
                '}';
    }
}
