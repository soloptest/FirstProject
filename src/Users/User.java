package Users;

public class User {
    public String name;
    public int age;
    private int passport;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public int getPassport() {
        return passport;
    }
}
