package defaultmethods;

public class Car2 implements vehicle,fourWheeler{
    public void print(){
        vehicle.super.print();
    }
}
