package TEST2.Constructor_chaining_using_super;

public class SuperTest {
    public static void main(String[] args) {
        Dog myDog = new Dog("Max", "toddle");

        myDog.eat();
        myDog.bark();
    }
}
