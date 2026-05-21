package polymorphism;

public class MainExec {
    public static void main(String[] args) {
        //Poly (many) + morphism (form) -> many form
        //Animal, Person

        // 2 type -> Static ( method overloading ) and
        // Dynamic ( override method )

        System.out.println("----------------");
        //static polymorphism -> method overloading
        Animal animal = new Animal();
        animal.getInfo();
        animal.getInfo(4);
        animal.getInfo("Poppy");

        System.out.println("----------------");
        //Dynamic polymorphism -> override method
        Animal dog = new Dog();
        dog.getInfo();
        dog.getInfo(4);
        dog.getInfo("Dog");

        System.out.println("----------------");
        Animal fish = new Fish();
        fish.getInfo();
        fish.getInfo(0);
        fish.getInfo("Fish");
    }
}
