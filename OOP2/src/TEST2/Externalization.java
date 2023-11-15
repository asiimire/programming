import java.io.*;

public class Externalization implements Externalizable {
    private String name;
    private int age;

    public Externalization(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
        name = (String)in.readObject();
        age = in .readInt();
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException{
        out.writeObject(name);
        out.writeInt(age);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
