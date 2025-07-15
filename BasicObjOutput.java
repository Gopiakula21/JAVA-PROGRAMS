import java.io.*;
class Person implements Serializable{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
public class BasicObjOutput {
    public static void main(String[] args) {
        try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("person.bin"))){
            Person person=new Person("Benny", 21);
           oos.writeObject(person);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
