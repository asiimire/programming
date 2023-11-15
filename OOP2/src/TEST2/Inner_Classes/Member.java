package TEST2.Inner_Classes;

public class Member {
    private int outerVar;

    public class InnerClass{
        public void innerMethod(){
            System.out.println("Accessing outerVar from InnerClass: "+ outerVar);
        }
    }
}
/*
 * A member inner class is defined at the member level of a class
 * (similar to methods, instance variables, and constructors).
 * It can be declared with any access modifier
 * (public, private, protected, default), just like other members of the class.
 * It has access to the outer class's members, including private members.
 */