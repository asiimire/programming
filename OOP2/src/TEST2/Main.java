import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception, IOException {
        File f = new File("file.txt");
        Externalization e = new Externalization("Asiimire",21);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
        out.writeObject(e);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
        e = (Externalization)in.readObject();
        System.out.println("After the externalization, name is: "+ e.getName() +"and age is: "+ e.getName());
//deserialize
        Externalization e = null;
        try {
            FileInputStream fis = new FileInputStream("file.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            e = (Externalization)ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception k) {
            k.printStackTrace();
            System.out.println(e.name);
            System.out.println(e.age);
        }
    }
    
}
