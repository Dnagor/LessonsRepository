package ua.lviv.lgs.lesson17.lecture;

public class PersonableApplication {
    public static void main(String[] args) {

        PersonFactory personFactory = new PersonFactory();
        Personable sportsMan = personFactory.ctreateSportsMan();
        sportsMan.eat();
        sportsMan.sleep();
        sportsMan.walk();

        Personable houseCleaner = personFactory.createHouseCleaner();
        houseCleaner.walk();
        houseCleaner.eat();
        houseCleaner.sleep();

        Personable anonymous = personFactory.createAnonymous();
        anonymous.sleep();
        anonymous.eat();
        anonymous.walk();

        Personable driver = PersonFactory.createDriver();
        driver.walk();
        driver.eat();
        driver.sleep();
    }
}
