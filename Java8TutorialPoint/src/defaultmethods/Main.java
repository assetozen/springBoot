package defaultmethods;

public class Main {
    public static void main(String[] args) {

        System.out.println("Case1: create an own method that overrides the default implementation.");
        Car1 car1 = new Car1();
        car1.print();
        System.out.println();

        System.out.println("Case2: call the default method of the specified interface using super.");
        Car2 car2 = new Car2();
        car2.print();
    }
}
