package TEST2.Constructor_chaining_using_super;

public class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + "is eating.");
    }
}
