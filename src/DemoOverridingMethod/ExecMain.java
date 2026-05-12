package DemoOverridingMethod;

public class ExecMain {
    public static void main(String[] args) {
        //Create object Card
        Card objCard = new Card();

        System.out.println();
        System.out.println(objCard.MessageGreeting());

        //Create BirthdayCard
        System.out.println("====================");
        BirthDayCard objBirth = new BirthDayCard();
        System.out.println(objBirth.MessageGreeting());

        //Create BirthdayCard
        System.out.println("====================");
        HolidayCard objHoli = new HolidayCard();
        System.out.println(objHoli.MessageGreeting());
    }

}
