package Week1;

public class InheritanceRun {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal cow = new Cow();
        cat.makeSound();
        dog.makeSound();
        cow.makeSound();
    }
}
