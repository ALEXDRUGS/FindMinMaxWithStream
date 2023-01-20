import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindMinMaxWithStream {
    public static void findMinMax(Stream<Integer> stream, Comparator<Integer> order,
                                  BiConsumer<Integer, Integer> minMaxConsumer) {
        List<Integer> minMaxList = stream.toList();
        Integer min = minMaxList.stream().min(order).orElse(null);
        Integer max = minMaxList.stream().max(order).orElse(null);
        minMaxConsumer.accept(min, max);
    }

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer =
                ((integer, integer2) -> System.out.println(" Min " + integer + "\n Max " + integer2));
        findMinMax(IntStream.rangeClosed(1, 100).boxed(), Comparator.naturalOrder(), biConsumer);
    }
}
