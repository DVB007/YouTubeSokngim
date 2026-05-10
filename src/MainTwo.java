public class MainTwo {
    public static void main(String[] args) {
        //To create Object from user
        User user = new User();

        user.Register("David","David@gmail.com","Student","David123");
        user.GetInfo();

        System.out.println("==========");
        User user1 = new User();
        user1.Register("Chan","chan@gmail.com","Teacher","Chan123");
        user1.GetInfo();
    }
}
