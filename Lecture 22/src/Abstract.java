public class Abstract {
    public static void main(String[] args){

        Horse h = new Horse();
        h.eat();
        h.walk();
        //h.color;

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        //c.color;
        //Animal a = new Animal(); cant create abstract func

        Mustang myHorse = new Mustang();
    }
}
abstract class Animal {
    void eat() { //non-abstract method
        System.out.println("animal eats");
    }
    abstract void walk(); //abstract method - no implementation only idea

    String color;
    Animal() { //constructor
        System.out.println("Animal constructor called");
    }
}
class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");
    }
    void walk() {
        System.out.println("Walks on 4 legs");
    }
    void changeColor() {
        color = "darkbrown";
    }
}
class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");

    }
}
class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
    void changeColor() {
        color = "yellow";
    }
}