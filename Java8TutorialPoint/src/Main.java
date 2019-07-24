import java.io.UnsupportedEncodingException;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.stream.Collectors;

public class Main implements Vehicle {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<String> names = new ArrayList<String>();
        names.add("Assu");
        names.add(null);
        names.add("Sari");
        names.add("Noah");
        names.add("Paulos");
        names.add("");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    public void print() {
        System.out.println("printmeeeeeeeeee");
    }

    public static void printNames(String name) {
        System.out.println(name + "AAA");
    }

}

interface Vehicle {
    default void print() {
        System.out.println("I am a vehicle!");
    }

    static void blowHorn() {
        System.out.println("Blowing horn!!!");
    }
}

