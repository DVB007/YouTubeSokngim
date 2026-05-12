package DemoSuper;

public class Vehicle {
    //date member / field / variable
    int speed = 120;

    //Constructor
    public Vehicle(){
        System.out.println("This is Vehicle ConStructor...");
    }

    public Vehicle(String name){
        System.out.println("Vehicle Name "+name);
    }

    //method
    public void display(){
        System.out.println("This is Vehicle");
    }
}
