package ua.lviv.lgs.lesson23.homework.task2;

import java.util.Comparator;

public class TableHeightComparator implements Comparator<Table> {
    @Override
    public int compare(Table o1, Table o2) {

        if (o1.getHeight() > o2.getHeight()) {
            return 1;
        } else if (o1.getHeight() < o2.getHeight()) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else {
                if (o1.getWidth() > o2.getWidth()) {
                    return 1;
                } else if (o1.getWidth() < o2.getWidth()) {
                    return -1;
                } else {
                    if (o1.getWeight() > o2.getWeight()) {
                        return 1;
                    } else if (o1.getWeight() < o2.getWeight()) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}
