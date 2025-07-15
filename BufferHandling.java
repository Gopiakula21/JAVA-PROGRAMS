import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class BufferHandling {
    public static void main(String[] args) {
        try(BufferedReader reader=
        new BufferedReader(new FileReader("abc.text"))){
            String line;
            System.out.println("Reading file Content: ");
            while((line=reader.readLine()) !=null)
            {
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Caught IOException: "+e.getMessage());
        }
    }
    
}
