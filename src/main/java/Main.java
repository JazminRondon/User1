import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        User user1 = new User();//User()

        user1.setUserName("Mikaila");
        System.out.println(user1.getUserName());
        User user2 = new User();
        user2.setUserName("Andrew");

        System.out.println(user2.getUserName());

        User user3 = new User("Jazmin","Coding",1000,new String[]{"123 Main St","231 Buck Dr"});
        user3.resetPassword("NEW PW");
        System.out.println(user3.getPassWord());
        user3.useRewardPoints(100);
        user1.setAccountBalance(-1000.0);
        user1.getAccountBalance();
        user3.printAllAddresses();
        user3.printUserProfile();


    }

}
