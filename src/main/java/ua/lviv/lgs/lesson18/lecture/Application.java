package ua.lviv.lgs.lesson18.lecture;

public class Application {
    public static void main(String[] args) {

        //one generic
        Generic<Integer> gOb = new Generic<>(88);
        gOb.showType();

        int value = gOb.getOb();
        System.out.println("Value: "+ value);

        Generic<String> gOs = new Generic<>("some words");
        gOs.showType();

        String line = gOs.getOb();
        System.out.println("Value: "+ line);

        //two generics
        TwoGen<Integer,String> tgob = new TwoGen<>(90,"Lorem text");
        tgob.showTypes();

        int valueTg = tgob.getObt();
        String lineTg = tgob.getObv();

        System.out.println("Value T of simple generic is: "+valueTg+"\n"+"Value V of simple generic is: "+lineTg);


        Integer[] integers = {1,2,3,4,5};
        Restriction<Integer> restriction = new Restriction<>(integers);
        System.out.println("Average int= "+ restriction.average());

        Double[] doubles = {43.3, 43.1, 555.3,345.4,124.0,4432.3,32.2};
        Restriction<Double>  doubleRestriction = new Restriction<>(doubles);
        double i =doubleRestriction.average()*100;
        i=Math.round(i);
        System.out.println("Average double = "+ i/100);

        //wildcarts
        TwoC[] tc = {
                new TwoC(2,4),
                new TwoC(3,-4),
                new TwoC(4,-5),
                new TwoC(-1,3)
        };
        Coordinates<TwoC> twoc = new Coordinates(tc);
        Coordinates.showXY(twoc);
       // Coordinates.showXYZ(twoc);   compilation error.
        Coordinates.showXYsuper(twoc);
        FourC[] fc = {
                new FourC(2,4,-4,-1),
                new FourC(-3,5,4,6),
                new FourC(-1,-4,-4,-6),
                new FourC(12,2,4,6),
                new FourC(5,-3,4,6)

        };
        Coordinates<FourC> fourCCoordinates = new Coordinates<>(fc);
        Coordinates.showXY(fourCCoordinates);
        Coordinates.showXYZ(fourCCoordinates);
        Coordinates.showXYZT(fourCCoordinates);
        Coordinates.showXYsuper(fourCCoordinates);

        ThreeC[] threeC = {
                new ThreeC(2,-4,-1),
                new ThreeC(-5,4,6),
                new ThreeC(-1,-4,-6),
                new ThreeC(12,2,6),
                new ThreeC(5,-3,4)
        };
        Coordinates<ThreeC> threeCCoordinates = new Coordinates<>(threeC);
        Coordinates.showXY(threeCCoordinates);
        Coordinates.showXYZ(threeCCoordinates);
        //Coordinates.showXYZT(threeCCoordinates); compile error.
        Coordinates.showXYsuper(threeCCoordinates);

        // gen
        Gen3<String,Integer> x = new Gen3<>("Value is: ",99);
        System.out.println(x.getOb());
        System.out.println(x.getOb2());

    }
}
