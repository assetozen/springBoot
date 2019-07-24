package defaultmethods;

public interface fourWheeler {
    default void print(){
        System.out.println("I am a four wheeler");
    }
}
