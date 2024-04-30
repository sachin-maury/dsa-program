class Animal{
    public void makeSound(){
        System.out.println("Animal is souting :");
    }

}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking :");
    }
    public void eat(){
        System.out.println("Dog is eating :");
    }
}

public class ovrriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.makeSound();
        dog.bark();
        dog.eat();
    }
}
