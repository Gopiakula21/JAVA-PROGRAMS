import java.io.*;
public class BasicFileWriter {
    public static void main(String[] args) {
       try( FileWriter fw=new FileWriter("Output.txt")){
        fw.write("Today is Monday");
       }
       catch(IOException e){
        e.printStackTrace();
       }
    }
    
}
 