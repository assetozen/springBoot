import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names =  new ArrayList<String>();
        names.add("Assegd");
        names.add("Sara");
        names.add("Noah");
        names.add("Michael");
        names.add("Nathnael");

        System.out.println("Printing all the names with a method reference ::print:--");
        names.forEach(System.out::println);
    }
}
