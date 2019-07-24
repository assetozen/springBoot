package staticdefaultmethods;

public interface FourWheelerAuto {
    default void print(){
        System.out.println("I am a four wheeler!");
    }
}
