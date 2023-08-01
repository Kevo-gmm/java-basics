/**
 * Animal
 */
/**
 * Mammal
 */
abstract class Mammal {
    abstract public void group();    
}

class Animal extends Mammal {
    private String name;
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    public String getName() {
        return name;
    }
  
    public void group() {
       System.out.println("This is a an abstract method implement in the child class");
    }
}

/**
 * Dog
 */
class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name); // Call the constructor of the superclass (Animal)
        this.breed = breed;
        System.out.println("Dog constructor called");
    }
    public String getBreed() {
        return breed;
    }
}

/**
 * App_2
 */
public class App_2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Tusker", "German Shephered");
        System.out.println(dog.getBreed());
        System.out.println(dog.getName());
        dog.group();
    }
}