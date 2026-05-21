package polymorphism;

public class Dog extends Animal{

    //override method
    @Override
    public void getInfo(){
        System.out.println("This is the information from Dog Class.");
    }
}
