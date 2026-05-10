public class Main {
    public static void main(String[] args) {

        //To create Object from Class Dog
        Dog dog1 = new Dog();
        dog1.Bark();
        dog1.Eat();
        dog1.Sleep();
        System.out.println("Name : "+dog1.name);
        System.out.println("Age : "+dog1.age);
        System.out.println("Color : "+dog1.color);

        //dog2
        Dog dog2 = new Dog();
        dog2.Bark();
        dog2.Eat();
        dog2.Sleep();
        System.out.println("Name : "+dog2.name);
        System.out.println("Age : "+dog2.age);
        System.out.println("Color : "+dog2.color);
    }
}
