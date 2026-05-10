public class User {
//    State => Username, Email, Role, Password
    public String Username;//Use public
    private String Email;//Use private
    protected String Role;//Use Protected
    String Password;//Use Default

//    Behavior => Register and GetInfo
    public void Register (String name, String email, String role, String password){
        Username = name;
        Email = email;
        Role = role;
        Password = password;
    }

    public void GetInfo(){
        System.out.println("Name : "+Username);
        System.out.println("Email : "+Email);
        System.out.println("Role : "+Role);
        System.out.println("Password : "+Password);
    }
}
