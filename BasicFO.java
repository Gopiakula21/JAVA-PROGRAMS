import java.util.*;
import java.io.*;
public class BasicFO {
    public static void main(String[] args) {
        try(FileOutputStream fos=new FileOutputStream("Output.txt")){
            String data="Good morning namasthe ";
            fos.write(data.getBytes());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
