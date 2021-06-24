package ua.lviv.lgs.lesson18.lecture;

public class Gen <T>{
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }
}

class Gen2<T> extends Gen<T>{

    public Gen2(T ob) {
        super(ob);
    }


    public T getOb() {
        return super.getOb();
    }


    public void setOb(T ob) {
        super.setOb(ob);
    }
}
class  Gen3<T,V> extends Gen<T>{
    V ob2;

    public Gen3(T ob, V ob2) {
        super(ob);
        this.ob2 = ob2;
    }

    public V getOb2() {
        return ob2;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }
}