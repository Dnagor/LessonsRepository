package ua.lviv.lgs.lesson14.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Tv> setTv = new HashSet<>();
        setTv.add(new Tv("Samsung", 32));
        setTv.add(new Tv("LG", 41));
        setTv.add(new Tv("LG", 32));
        setTv.add(new Tv("Samsung", 37));
        setTv.add(new Tv("LG", 37));
        setTv.add(new Tv("LG", 42));
        setTv.add(new Tv("Philips", 55));
        setTv.add(new Tv("LG", 47));
        setTv.add(new Tv("LG", 51));
        setTv.add(new Tv("Samsung", 41));
        setTv.add(new Tv("Saturn", 55));
        setTv.add(new Tv("Samsung", 42));
        setTv.add(new Tv("Samsung", 47));
        setTv.add(new Tv("NoName", 25));
        setTv.add(new Tv("Samsung", 51));
        System.out.println("HashSet: " + setTv);

        List<Tv> tvList = new ArrayList<>(setTv);
        Collections.sort(tvList);
        System.out.println("ArrayList :" + tvList);

        Set<Tv> tvSet = new TreeSet<>(new TvComparator());
        tvSet.add(new Tv("Samsung", 32));
        tvSet.add(new Tv("LG", 41));
        tvSet.add(new Tv("LG", 32));
        tvSet.add(new Tv("Samsung", 37));
        tvSet.add(new Tv("LG", 37));
        tvSet.add(new Tv("LG", 42));
        tvSet.add(new Tv("Philips", 55));
        tvSet.add(new Tv("LG", 47));
        tvSet.add(new Tv("LG", 51));
        tvSet.add(new Tv("Samsung", 41));
        tvSet.add(new Tv("Saturn", 55));
        tvSet.add(new Tv("Samsung", 42));
        tvSet.add(new Tv("Samsung", 47));
        tvSet.add(new Tv("NoName", 25));
        tvSet.add(new Tv("Samsung", 51));
        System.out.println("TreeSet: " + tvSet);
//        for (Tv tv : tvSet ) {
//            System.out.println(tv);
//        }

        Set<Tv> linkedSet = new LinkedHashSet<>();
        linkedSet.add(new Tv("Samsung", 32));
        linkedSet.add(new Tv("LG", 41));
        linkedSet.add(new Tv("LG", 32));
        linkedSet.add(new Tv("Samsung", 37));
        linkedSet.add(new Tv("LG", 37));
        linkedSet.add(new Tv("LG", 42));
        linkedSet.add(new Tv("Philips", 55));
        linkedSet.add(new Tv("LG", 47));
        linkedSet.add(new Tv("LG", 51));
        linkedSet.add(new Tv("Samsung", 41));
        linkedSet.add(new Tv("Saturn", 55));
        linkedSet.add(new Tv("Samsung", 42));
        linkedSet.add(new Tv("Samsung", 47));
        linkedSet.add(new Tv("NoName", 25));
        linkedSet.add(new Tv("Samsung", 51));
        System.out.println("LinkedHashSet: " + linkedSet);

        List<Tv> linkedSetList = new ArrayList<>(linkedSet);
        Collections.sort(linkedSetList);
        System.out.println(linkedSetList);

    }
}
