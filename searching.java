import java.util.*;
public class searching{
    public static void main(String[] args){
        String[] bikes={"HD","BMW","RE","DUCATI","APRILLA"};
        String search="HD";
        int max=0;
        boolean found=false;
        for(String bike:bikes){
            if(bike.equalsIgnoreCase(search)){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(search+" is found");
        }
        else{
            System.out.println(search+" not found");
        }
         for(String bike:bikes){
            if(max<bike.length()){
                max=bike.length();          
                }
            
        }
        System.out.println("Maximum: "+max);

    }
}