class Animal{
    public void sound(){
        System.out.println("Animal is sound");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking ");
    }
}
public class override {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Dog dog = new Dog();
        dog.bark();
        
    }
}
