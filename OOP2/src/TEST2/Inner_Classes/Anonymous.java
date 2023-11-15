package TEST2.Inner_Classes;

public class Anonymous extends Animals {
    public static void main(String[] args) {
        Animals cat = new Animals(){
            void makeSound(){
                System.out.println("Meow!");
            }
        };

        cat.makeSound();
    }
}
/*
 * An anonymous inner class is a class without a name that is
 * defined and instantiated at the same time.
 * It is often used for creating one-time-use objects, such as event handling.
 */