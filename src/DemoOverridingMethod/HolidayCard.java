package DemoOverridingMethod;

public class HolidayCard extends Card{
    //Overriding

    @Override
    public String MessageGreeting(){
        return "Wish you on your Holiday!!!";
    }

    //Note if you add annotation override on method are not override it'll be error
}
