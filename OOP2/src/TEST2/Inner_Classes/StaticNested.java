package TEST2.Inner_Classes;

public class StaticNested {
    private static int staticVar;

    public static class InnerStatic{
        public void nestedMethod(){
            System.out.println("Accessing staticVar from StaticNested: "+staticVar);
        }
    }
    
}
/*
 * A static nested class is a static class
 * that is defined at the member level of a class.
 * It cannot access non-static members of the outer class directly.
 * However, it can access static members.
 */
