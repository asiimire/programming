import java.io.*;

public class Serialization implements Serializable {
    private String name;
    private int age;

    public Serialization(){}
    public Serialization(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        try {
            Serialization obj = new Serialization("Mugisa", 24);
            FileOutputStream fos = new FileOutputStream("info.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
