import java.util.*;
public class posornegorequ{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num=sc.nextFloat();
        if(num>0)
          System.out.println("Positive Number");
        else if(num<0)
          System.out.println("Negative Number");
        else if(num==0)
          System.out.println("Equal to Zero");
    }
}