import Users.User;

public class Main {
    public static void main(String[] args) {
        User user =  new User();
        user.age = 32;
        user.name = "Oleg";
        user.setPassport(23412);
        System.out.println(user.getPassport());
        System.out.println(user.name);

        User user1 = new User("Vasya", 24);
        user1.setPassport(228);
        System.out.println(user1.getPassport());

        Developers user2 = new Developers();
        user2.language = "Java";



    }
}