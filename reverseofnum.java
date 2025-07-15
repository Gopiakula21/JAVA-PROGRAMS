import java.util.*;
public class reverseofnum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int num=sc.nextInt();
        int rem=0;
        while(num>0){
            rem=rem*10+num%10;
            num=num/10;
        }
        System.out.print("Reverse of a number is: "+rem);
        sc.close();
    }
}