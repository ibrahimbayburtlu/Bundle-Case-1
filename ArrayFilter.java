import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayFilter {

    public static List<Integer> filterArrays(List<String[]> arrays) {
        return arrays.stream()
                .flatMap(Arrays::stream)
                .filter(str -> str != null && isNumeric(str))
                .map(Integer::parseInt)
                .collect(Collectors.groupingBy(it -> it / 3, Collectors.summingInt(Integer::intValue)))
                .entrySet().stream()
                .filter(entry -> entry.getValue() >= 90)
                .flatMap(entry -> Stream.of(entry.getKey() * 3, entry.getKey() * 3 + 1, entry.getKey() * 3 + 2))
                .collect(Collectors.toList());
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+");
    }

    public static void main(String[] args) {
        List<String[]> arrays = new ArrayList<>();
        arrays.add(new String[]{"0", "s1", null, "35", "90", "60"});
        arrays.add(new String[]{"ttt", null, null, "15"});
        arrays.add(new String[]{"75", "95", "0", "0", null, "ssss", "0", "-15"});
        arrays.add(new String[]{"25", "fgdfg", "", "105", "dsfdsf", "-5"});

        List<Integer> result = filterArrays(arrays);

        System.out.println(result);
    }
}
