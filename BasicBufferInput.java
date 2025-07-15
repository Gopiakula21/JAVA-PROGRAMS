import java.io.*;
public class BasicBufferInput {
    public static void main(String[] args) {
        try(BufferedInputStream Bis=new BufferedInputStream(new FileInputStream("Input.txt"))){
            int byteData;
            while ((byteData = Bis.read())!=-1) {
                System.out.println((char) byteData);
                
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
