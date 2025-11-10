package Week1;

//This is an example of a class i.e is a blueprint for a motorcycle.
//It has three attributes:- the make, color and the engine state.
//It has two methods:- one that prints the attributes and the other that can change the state of the engine. It can either be on or off.
public class Motorcycle {
    String make;
    String color;
    boolean engineState;

    void startEngine() {
        if (engineState == true) {
            System.out.println("Engine is already running.");
        } else {
            this.engineState = true;
            System.out.println("Engine is now running.");
        }
    }

    void showAtts() {
        System.out.println("The make of the motorcycle is:- " + this.make);
        System.out.println("The color of the motorcycle is:- " + this.color);
        if (engineState == true) {
            System.out.println("The engine is on");
        } else {
            System.out.println("The engine is off");
        }
    }
}
