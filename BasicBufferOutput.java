import java.io.*;
public class BasicBufferOutput {
 public static void main(String[] args) {
     try(BufferedOutputStream Bos=new BufferedOutputStream(new FileOutputStream("Output.txt"))){
            String data="Ne Output Chusuko First";
            Bos.write(data.getBytes());
                
        }
        catch(IOException e){
            e.printStackTrace();
        }
 }    
}
