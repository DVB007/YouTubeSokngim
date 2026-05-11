public class ExecuteDemoUser {
    public static void main(String[] args) {
        //TODO Auto-generated method stub

        //Create ob user
        DemoUser objDemoUser = new DemoUser();

        //method set from DemoUser
        System.out.println("===============");
        objDemoUser.setId(1);
        objDemoUser.setUsername("David");
        objDemoUser.setEmail("David@gmail.com");
        objDemoUser.setPassword("1234");

        //method get from user
        System.out.println("ID : "+objDemoUser.getId());
        System.out.println("USER NAME : "+objDemoUser.getUsername());
        System.out.println("EMAIL : "+objDemoUser.getEmail());
        System.out.println("PASSWORD : "+objDemoUser.getPassword());

        //Create ob user
        DemoUser objDemoUser2 = new DemoUser();

        //method set from DemoUser
        System.out.println("===============");
        objDemoUser2.setId(2);
        objDemoUser2.setUsername("Phin");
        objDemoUser2.setEmail("Phin@gmail.com");
        objDemoUser2.setPassword("4321");

        //method get from user
        System.out.println("ID : "+objDemoUser2.getId());
        System.out.println("USER NAME : "+objDemoUser2.getUsername());
        System.out.println("EMAIL : "+objDemoUser2.getEmail());
        System.out.println("PASSWORD : "+objDemoUser2.getPassword());
    }
}
