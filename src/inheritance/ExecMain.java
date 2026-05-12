package inheritance;

public class ExecMain {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println();
        System.out.println("Hello");

        //parent -> 1st child -> 2nd child

        //Create Animal obj
        System.out.println();
        Animal objAnimal = new Animal();
        objAnimal.eat();
        objAnimal.sleep();

        System.out.println("==========");
        System.out.println("Reptile child of Animal");

        //Create Reptile object
        Reptile objReptile = new Reptile();
        objReptile.eat();// Call parent method
        objReptile.sleep();// Call Parent method
        objReptile.crawl();// Call reptile method

        System.out.println("==========");
        System.out.println("Mamal child of Animal");

        //Create Mamal object
        Mamal objMamal = new Mamal();
        objMamal.eat();
        objMamal.sleep();
        objMamal.breastfeed();

        System.out.println("==========");
        System.out.println("Human child of Mamal");

        //Create Human object
        Human objHuman = new Human();
        objHuman.eat();
        objHuman.sleep();
        objHuman.breastfeed();
        objHuman.speak();
        objHuman.walk();
    }
}
