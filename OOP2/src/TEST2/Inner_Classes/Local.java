package TEST2.Inner_Classes;

public class Local {
    private int outerVar = 10;

    public void outerMethod(){
        final int localVar = 20;

        class LocalInnerClass{
            public void innerMethod(){
                System.out.println("Accessing outerVar and localVar from LocalInnerClass: "+ outerVar + "," + localVar);
            }
        }

        LocalInnerClass inner = new LocalInnerClass();
        inner.innerMethod();
    }
}
/*
 * A local inner class is defined within a block of code
 * (usually within a method).
 * It has access to the members of the enclosing class and local variables that are marked as final or effectively final.
 * It is not accessible outside the block where it is defined.
 */