package ua.lviv.lgs.lesson12.task3;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>();
        integerMyList.add(12);
        integerMyList.add(15);
        integerMyList.add(12);
        integerMyList.add(12);
        integerMyList.add(12);
        integerMyList.add(12);
        integerMyList.add(12);
        integerMyList.add(12);
        integerMyList.add(12);
        integerMyList.add(12);
        integerMyList.add(12);


        System.out.println(integerMyList.size());
        System.out.println(integerMyList.toString());
    }
}
