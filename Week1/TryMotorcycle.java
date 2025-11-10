package Week1;

//This class is used to create an object of the motorcycle class.
public class TryMotorcycle {
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        m.make = "BMW";
        m.color = "Red";
        m.engineState = false;
        m.showAtts();
        m.startEngine();
        m.showAtts();
    }
}
