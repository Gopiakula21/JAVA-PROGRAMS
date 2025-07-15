import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class BufferReader {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter your Name: ");
            String name=sc.nextLine();
            System.out.println("Name: "+name+" : ");
        }
    }
    
}
