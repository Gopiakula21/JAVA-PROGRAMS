import java.io.*;
public class BasicOutputStream {
    public static void main(String[] args) {
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("data.bin"))){
            dos.writeInt(111);
            dos.writeFloat(6.7f);
            dos.writeUTF("Hello");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
    
}
