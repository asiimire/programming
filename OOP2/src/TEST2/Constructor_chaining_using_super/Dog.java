package TEST2.Constructor_chaining_using_super;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

}
