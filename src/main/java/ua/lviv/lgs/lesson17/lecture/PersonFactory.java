package ua.lviv.lgs.lesson17.lecture;

public class PersonFactory {


    //Inner Class
    public class SportsMan implements Personable {
        @Override
        public void sleep() {
            System.out.println("SpotsMan sleeps");
        }

        @Override
        public void eat() {
            System.out.println("SpotsMan eats");
        }

        @Override
        public void walk() {
            System.out.println("SpotsMan walks");
        }
    }

    public SportsMan ctreateSportsMan() {
        return new SportsMan();
    }
//Local class (is created in method)
    public Personable createHouseCleaner(){
        class HouseCleaner implements Personable{

            @Override
            public void sleep() {
                System.out.println("HouseCleaner sleeps");
            }

            @Override
            public void eat() {
                System.out.println("HouseCleaner eats");
            }

            @Override
            public void walk() {
                System.out.println("HouseCleaner walks");
            }
        }
        return new HouseCleaner();
    }

    //Anonymous class
    public Personable createAnonymous(){
        return new Personable() {
            @Override
            public void sleep() {
                System.out.println("Anonymous sleeps");
            }

            @Override
            public void eat() {
                System.out.println("Anonymous eats");
            }

            @Override
            public void walk() {
                System.out.println("Anonymous walks");
            }
        };
    }

    //static nested
    private static class Driver implements Personable{

        @Override
        public void sleep() {
            System.out.println("Driver sleeps");
        }

        @Override
        public void eat() {
            System.out.println("Driver eats");
        }

        @Override
        public void walk() {
            System.out.println("Driver walks");
        }
    }
    public static Driver createDriver(){
        return new Driver();
    }
}