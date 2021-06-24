package ua.lviv.lgs.lesson18.lecture;

public class Coordinates<T extends TwoC> {

    T[] coords;

    public Coordinates(T[] coords) {
        this.coords = coords;
    }
    public static void showXY(Coordinates<?> c){
        System.out.println("Coordinates of X Y: ");
        for (int i = 0; i<c.coords.length;i++) {
            System.out.println(c.coords[i].x+"----"+c.coords[i].y);
        }
    }

    public static void showXYZ(Coordinates<? extends ThreeC> c){
        System.out.println("Coordinates of X Y Z: ");
        for (int i = 0; i<c.coords.length;i++) {
            System.out.println(c.coords[i].x+"----"+c.coords[i].y+"----"+c.coords[i].z);
        }
    }
    public static void showXYZT(Coordinates<FourC> c){
        System.out.println("Coordinates of X Y Z T: ");
        for (int i = 0; i<c.coords.length;i++) {
            System.out.println(c.coords[i].x+"----"+c.coords[i].y+"----"+c.coords[i].z+"----"+c.coords[i].t);
        }
    }
    public static void showXYsuper(Coordinates<? super FourC> c){
        System.out.println("Super Coordinates of X Y: ");
        for (int i = 0; i<c.coords.length;i++) {
            System.out.println(c.coords[i].x+"----"+c.coords[i].y);
        }
    }
}

class TwoC{
    int x;
    int y;

    public TwoC(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class ThreeC extends TwoC{

    int z;

    public ThreeC(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
class FourC extends ThreeC{

    int t;

    public FourC(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }
}