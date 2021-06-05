package ua.lviv.lgs.lesson13.task1;

import java.util.Comparator;

public class DepytyBribeComparator implements Comparator<Deputy> {
    @Override
    public int compare(Deputy o1, Deputy o2) {
        if(o1.getAmountOfBribe()<o2.getAmountOfBribe()){
            return 1;
        }else if(o1.getAmountOfBribe()>o2.getAmountOfBribe()){
            return -1;
        }
        return 0;
    }
}
