package ua.lviv.lgs.lesson18.lecture;

public class Generic <T>{

    T ob;

    public Generic(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void showType(){
        System.out.println("Type of T is: "+ ob.getClass().getSimpleName());
    }
}
