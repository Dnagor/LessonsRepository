package ua.lviv.lgs.lesson17.homework;

public interface Iterator {
    boolean hasNext();

    Object next();
}

class Collection {
    private static Number[] arr;
    private int count;
    private int c;

    Collection(Number[] arr) {
        Collection.arr = arr;
    }

    public Forward createForward() {
        return new Forward();
    }

    public Backward createBackward() {
        return new Backward();
    }

    public Iterator createBackwardEven() {
        count = arr.length - 1;
        c = 0;
        Object obj = new Object();
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return count >= 0;
            }

            @Override
            public Object next() {
                for (Object obj : arr) {
                    if (c == 2 && (count >= 0)) {
                        c = 0;
                        if (arr[count].doubleValue() % 2 == 1) {
                            obj = arr[count];
                            count--;
                            return obj;
                        }
                    }
                    count--;
                    c++;
                }
                return "як це виправити?";
            }


        };
    }

    public Iterator createLocal() {

        class Local implements Iterator {
            private int count = 0;
            private int c = 1;

            @Override
            public boolean hasNext() {
                return count < arr.length;
            }

            @Override
            public Object next() {
                for (Object obj : arr) {
                    if (count < arr.length) {
                        if (c == 5 && (arr[count].intValue() > 0)) {
                            c = 0;
                            return arr[count].intValue() - 100;
                        }
                        count++;
                        c++;
                    }
                }

                return "як це забрати?";
            }
        }
        return new Local();
    }
    public static  Even createEven(){
        return new Even();
    }
    static class Even implements Iterator {
        int count = 0;
        Object obj;
        @Override
        public boolean hasNext() {
            return count < arr.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                for (Object obj : arr) {
                  if (arr[count].intValue()%2==0){
                      obj = arr[count].intValue()+1;
                      count+=2;
                      return obj;
                  }
                    count += 2;
                }
            }return "як це позбутись?";
        }
    }

    public class Forward implements Iterator {
        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < arr.length;
        }

        @Override
        public Object next() {
            if (arr[count].intValue() < 0) {
                count++;
                return 0;
            }
            return arr[count++];
        }
    }

    public class Backward implements Iterator {
        int count = arr.length - 1;
        Object obj;

        @Override
        public boolean hasNext() {
            return count >= 0;
        }

        @Override
        public Object next() {
            for (Object obj : arr) {
                obj = arr[count];
                count -= 2;
                return obj;
            }
            return obj;
        }
    }
}
