import java.io.*;
public class BasicInputData { 
    public static void main(String[] args) {
        

    try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("data.bin"))){
        dos.writeInt(5);
        dos.writeUTF("Good");
        dos.writeDouble(15.655423);
    }
    catch(IOException e){
        e.printStackTrace();
    }
    try(DataInputStream dis=new DataInputStream(new FileInputStream("data.bin"))){
        System.out.println("Int: "+dis.readInt());
        System.out.println("Double: "+dis.readDouble());
        System.out.println("String: "+dis.readUTF());
    }
    catch(IOException ex){
        ex.printStackTrace();
    }
}
}
