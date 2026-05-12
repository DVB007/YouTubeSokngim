package DemoSuper;

public class Car extends Vehicle{
    //constructor
    public Car(){
        super("TOYOTA");
        System.out.println("This is a Car");
    }
    //method
    public void show(){
        super.display();
        System.out.println("This is Car Method. The speed of the car is "+super.speed);
    }
}
