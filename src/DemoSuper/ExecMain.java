package DemoSuper;

public class ExecMain {
    public static void main(String[] args) {
        //Create object Vehicle
        Vehicle vehicle = new Vehicle();//output constructor
        vehicle.display();
        System.out.println("Vehicle Speed : "+vehicle.speed);

        System.out.println();

        //Create Object Car
        Car car = new Car();
//        System.out.println("Car's Speed : "+ car.speed);//parent
//        car.display();
        car.show();
    }
}
