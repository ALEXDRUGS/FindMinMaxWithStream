import java.util.Arrays;
import java.util.stream.Collectors;

//ТЗ: Выведите в одну строку массив строк, отсеяв дубли и сохранив порядок как в массиве.
public class Ticket10 {
    public static void main(String[] args) {
        String[] stringArr = new String[]{"123", "456", "123", "789", "456"};
        String str = Arrays.stream(stringArr).distinct().collect(Collectors.joining());
        System.out.println(str);
    }
}
