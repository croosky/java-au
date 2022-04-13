import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String[] words1 = {"i","love","leetcode","i","love","coding"};
        int k1 = 2;
        System.out.println(topKFrequent(words1, k1));
        String[] words2 = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k2 = 4;
        System.out.println(topKFrequent(words2, k2));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        return Stream.of(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByKey())
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map((e) -> e.getKey()).limit(k).collect(Collectors.toList());

    }
}
