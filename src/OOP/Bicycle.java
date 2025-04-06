package OOP;

public class Bicycle implements Vehicle {

    public int gear;
    int speed;

    @Override
    public void changeGear(int gear){
        this.gear=gear;
    }

    @Override
    public void applybrake(int brake){
        speed=speed-brake;
    }

    @Override
    public void speedUp(int acc){
        speed=speed+acc;
    }

    public void printStates(){
        System.out.println("Speed ==> "+ speed+ " Gear ==> "+ gear);
    }
    
}
