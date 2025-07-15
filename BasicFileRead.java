import java.io.*;
public class BasicFileRead {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("Input.txt")){
            int charData;
            while((charData=fr.read())!=-1){
                System.out.println((char) charData);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
