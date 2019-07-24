package defaultmethods;

public interface vehicle {
    default void print(){
        System.out.println("I am a vehicle");
    }
}
