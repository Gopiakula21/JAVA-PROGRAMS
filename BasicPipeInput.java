import java.io.*;
public class BasicPipeInput {
    public static void main(String[] args) throws IOException{
        PipedOutputStream pos=new PipedOutputStream();
        PipedInputStream pis=new PipedInputStream(pos);
        new Thread(()->{
            try{
                pos.write("Samsung,Nokia!!!".getBytes());
                pos.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }).start();
        new Thread(()->{
            try{
                int data;
                while((data=pis.read())!=-1){
                    System.out.println((char) data);
                }
                pis.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }).start();
    }
    
}
