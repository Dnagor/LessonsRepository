package ua.lviv.lgs.lesson23.lecture;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApplicationStreamApi {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("f1", "f2", "f3", "f4", "f4", "f2", "f5", "f10");
        Stream<String> stream = collection.stream();
        Stream<String> numberStream = Stream.of("1", "2", "3", "4");
        String[] stringArr = {"a", "b", "c", "d"};
        Stream<String> stringStream = Arrays.stream(stringArr);
        Stream<Object> objectStream = Stream.builder().add("1").add("2").add("3").build();

        long count = collection.stream().filter("f4"::equals).count();
        System.out.println(count);

        String orElse = collection.stream().skip(collection.size() - 2).findFirst().orElse("10000");
        System.out.println(orElse);

        List<String> distinct = collection.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);

        List<String> map = collection.stream().map(s -> s + " -)(-").collect(Collectors.toList());
        System.out.println(map);

        List<String> peek = collection.stream().map(s -> s.toUpperCase()).peek(s -> System.out.println(s)).collect(Collectors.toList());
        System.out.println(peek);

        String s2 = collection.stream().reduce((e1, e2) -> e1 + e2).get();
        System.out.println(s2);

        List<String> limit = collection.stream().limit(4).collect(Collectors.toList());
        System.out.println(limit);

        List<String> sort = collection.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);

        List<String> reversrSort = collection.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reversrSort);

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        System.out.println(Arrays.deepToString(data));
        System.out.println(Arrays.stream(data).flatMap(x -> Arrays.stream(x)).collect(Collectors.toList()));
        Stream<String[]> arrayStream = Arrays.stream(data);
        Stream<String> flatMap = arrayStream.flatMap(strings -> Arrays.stream(strings));
        List<String> flatMapFiltered = flatMap.filter(x -> "a".equals(x.toString())).collect(Collectors.toList());
        System.out.println(flatMapFiltered);

        String s = collection.stream().findFirst().orElse("10");
        System.out.println(s);
        String s1 = collection.stream().skip(2).findAny().orElse("2");
        System.out.println(s1);
        boolean b = collection.stream().anyMatch("f2"::equals);
        System.out.println(b);
        boolean b1 = collection.stream().noneMatch("7"::equals);
        System.out.println(b1);
        boolean b2 = collection.stream().allMatch("a1"::equals);
        System.out.println(b2);
        String min = collection.stream().min(String::compareTo).get();
        System.out.println(min);
        String max = collection.stream().max(String::compareTo).get();
        System.out.println(max);
    }
}
