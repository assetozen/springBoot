import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStreamStartsWith {

    public static void main(String[] args) {
        List<String> names2 = new ArrayList<String>();
        names2.add("Mahesh ");
        names2.add("Suresh ");
        names2.add("Ramesh ");
        names2.add("Naresh ");
        names2.add("Kalpesh ");

        Stream<String> s= names2.stream().filter(name -> name.startsWith("N"));
        System.out.println(s.collect(Collectors.toList()));


    }
}
