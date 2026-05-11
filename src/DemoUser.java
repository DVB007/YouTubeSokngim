public class DemoUser {
    //id, username, email, password, -> private
    // method get(), set() -> public

    private int id;
    private String username;
    private String email;
    private String password;

    //Set -> void with param
    public void setId(int id){
        this.id=id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    //get -> return type no param
    public int getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }



}
