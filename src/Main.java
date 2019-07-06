import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    private static final String[] data = {"a", "i", "u", "e", "o", "ka", "ki", "ku", "ke", "ko", "sa", "si", "su", "se", "so", "ta", "ti", "tu", "te", "to", "na", "ni", "nu", "ne", "no"};

    public static void main(String[] args) {
        List<String> list = Arrays.asList(data);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }
}
