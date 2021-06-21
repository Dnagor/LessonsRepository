package ua.lviv.lgs.lesson17.homework;

public class IteratorApplication {

    public static void main(String[] args) {
        Integer[] array = {4, -70, -8, 31, 48, -65, -21, 17, -77, 41,77,44,44};
        Collection collection= new Collection(array);
        Iterator iteratorForward = collection.createForward();
        System.out.println("iteratorForward.next()");
        while (iteratorForward.hasNext()){
            System.out.println(iteratorForward.next());
        }
        Iterator iteratorBackward = collection.createBackward();
        System.out.println("iteratorBackward.next()");
        while (iteratorBackward.hasNext()){
            System.out.println(iteratorBackward.next());
        }
        Iterator iteratorBackwardEven= collection.createBackwardEven();
        System.out.println("iteratorBackwardEven.next() кожен третій");
        while (iteratorBackwardEven.hasNext()){
            System.out.println(iteratorBackwardEven.next());
        }
        Iterator iteratorLocal= collection.createLocal();
        System.out.println("iteratorLocal.next() кожен пятий");
        while (iteratorLocal.hasNext()){
            System.out.println(iteratorLocal.next());
        }

        Iterator iteratorStatic =Collection.createEven();
        System.out.println("iteratorStatic.next()");
        while (iteratorStatic.hasNext()){
            System.out.println(iteratorStatic.next());
        }
    }
}
