
public class MainCar {
    public static void main(String[] args) {
        //Create object car
        Car carObj = new Car();

        //constructor No Parameter
        System.out.println("Year : " + carObj.YearCar);
        System.out.println("Model : " + carObj.ModelCar);
        System.out.println("===============");
        //Constructor have parameter
        Car carObj1 = new Car(2000,"Toyota");
        System.out.println("Year : " + carObj1.YearCar);
        System.out.println("Model : " + carObj1.ModelCar);
        System.out.println("===============");
        Car carObj2 = new Car(2016,"BYD");
        System.out.println("Year : " + carObj2.YearCar);
        System.out.println("Model : " + carObj2.ModelCar);
    }



}
