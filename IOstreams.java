import java.util.*;
import java.io.*;
public class IOstreams{
public static void main(String[] args) {
    try(FileInputStream fis=new FileInputStream("Input.txt")){
    int byteData;
    while ((byteData=fis.read())!=-1) {
        System.out.println((char) byteData);
        
    }
}
catch(IOException e){
    e.printStackTrace();
}
}
}