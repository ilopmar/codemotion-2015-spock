package codemotion2015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataHelper {

    public static List<Integer> someFibonacciNumbers() {
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.addAll(Arrays.asList(1, 1, 2, 3, 5, 8, 13));

        return fibonacciList;
    }

    public static List<Person> makePersonList() {
        return Arrays.asList(
            new Person("Sheldon", "Cooper"),
            new Person("Leonard", "Hofstadter"),
            new Person("Rajesh", "Koothrappali"),
            new Person("Howard", "Wolowitz")
        );
    }

    public static Map<String, ?> makePersonMap() {
        Map<String, Object> personMap = new HashMap<>();
        personMap.put("name", "Iván");
        personMap.put("lastName", "López");
        personMap.put("age", 35);

        return personMap;
    }
}
