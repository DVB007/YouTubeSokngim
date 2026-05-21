package polymorphism;

public class Animal {

    //override
    public void getInfo(){
        System.out.println("This is general information...");
    }

    public void getInfo(String name){
        System.out.println("This is animal name : "+ name);
    }

    public void getInfo(int leg){
        System.out.println("This is animal leg : "+leg);
    }
}
