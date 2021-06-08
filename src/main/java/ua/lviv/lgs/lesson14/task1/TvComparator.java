package ua.lviv.lgs.lesson14.task1;

import java.util.Comparator;

public class TvComparator implements Comparator<Tv> {
    @Override
    public int compare(Tv o1, Tv o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else {
            if (o1.getDiagonal() > o2.getDiagonal()) {
                return 1;
            } else if (o1.getDiagonal() < o2.getDiagonal()) {
                return -1;
            }
        }
        return 0;
    }
}
