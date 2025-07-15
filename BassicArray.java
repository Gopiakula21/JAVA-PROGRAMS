import java.io.*;
public class BassicArray {
    public static void main(String[] args) {
        byte[] data= "Mississipi is one of the state in the usa".getBytes();
        try(BufferedInputStream bis=new BufferedInputStream(new ByteArrayInputStream(data))){
            long byteCount=0;
            while(bis.read()!=-1){
                byteCount++;
            }
            System.out.println("Total Bytes in the input: "+byteCount);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
