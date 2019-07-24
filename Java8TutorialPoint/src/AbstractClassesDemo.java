public class AbstractClassesDemo {

    public static void main(String[] args) {
        abstractClassA Obj1 = new abstractClassB();
        Obj1.dance();
        Obj1.talk();
    }
}

 abstract class abstractClassA{
    public abstract void dance();
    public void talk(){
        System.out.println("talking. . .");
    }

}

class abstractClassB extends abstractClassA{
    public void dance(){
        System.out.println("B dancing. . .");
    }
}

class abstractClassC extends abstractClassA{
    public void dance(){
        System.out.println(" C dancing. . .");
    }
}
