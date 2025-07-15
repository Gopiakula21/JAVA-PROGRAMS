import java.io.*;
class Person implements Serializable{
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    @override
    public String toString(){
        return "Person{name=  '"+name +" ',age= "+age+ "}";
    }
}
public class BasicObjInput {
    public static void main(String[] args) {
        try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("person.bin"))){
            Person person=new Person("Gopi", 22);
            oos.writeObject(person);
            
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("person.bin"))){
            Person person=(Person)ois.readObject();
            System.out.println(person);
            
        } catch (IOException | ClassNotFoundException exc) {
            exc.printStackTrace();
            // TODO: handle exception
        }
    }
    
}
 