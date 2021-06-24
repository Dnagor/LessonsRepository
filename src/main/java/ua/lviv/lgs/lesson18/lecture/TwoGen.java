package ua.lviv.lgs.lesson18.lecture;

public class TwoGen <T,V> {

    T obt;
    V obv;

    public TwoGen(T obt, V obv) {
        this.obt = obt;
        this.obv = obv;
    }

    public T getObt() {
        return obt;
    }

    public void setObt(T obt) {
        this.obt = obt;
    }

    public V getObv() {
        return obv;
    }

    public void setObv(V obv) {
        this.obv = obv;
    }

    public void showTypes(){
        System.out.println("Type of T is: "+ obt.getClass().getSimpleName());
        System.out.println("Type of V is: "+ obv.getClass().getSimpleName());
    }
}
