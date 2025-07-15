import java.util.*;
public class pattern1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.next();
        int size=str.length();
        for(int i=0;i<size;i++){
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println(" ");
        }
        for(int i=size-1;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println(" ");
        }

    }
}