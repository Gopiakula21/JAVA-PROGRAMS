import java.util.*;
import java.io.IOException;
public class Throws {
    static void readInput() throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any data: ");
        String str=sc.nextLine();
        System.out.println("Entered Data: "+str);
        sc.close();
    }
public static void main(String[] args) {
    try{
        readInput();
    }
    catch(IOException e){
        System.out.println("Exception Occurred: ");
    }
}    
}
