package serialize;

import java.io.*;
public class Deserialization {
    public static void main(String[] args) {
        Serialization obj = null;
        try {
            FileInputStream fis = new FileInputStream("info.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (Serialization)ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(obj.name);
            System.out.println(obj.age);
        }
    }
}
