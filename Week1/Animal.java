package Week1;

// Here we have created a superclass Animal that has three subclasses i.e cat, dog and cow. \
public class Animal {
    String name;
    String sound;

    public void makeSound() {
        System.out.println("The " + name + " makes the sound " + sound);
    }
}
