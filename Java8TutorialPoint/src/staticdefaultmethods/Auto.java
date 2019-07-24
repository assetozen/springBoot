package staticdefaultmethods;

public class Auto implements Automobile,FourWheelerAuto {
    public void print(){
        Automobile.super.print();
        FourWheelerAuto.super.print();
        Automobile.blowHorn();
        System.out.println("I am an Automobile");
    }
}
