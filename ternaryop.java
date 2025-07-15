import java.util.*;
public class ternaryop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string1 : ");
        String a=sc.nextLine();
        System.out.print("Enter the string2: ");
        String b=sc.nextLine();
        boolean isEqual=a.equals(b);
        System.out.println("The concatinatedstrings are: "+(a+b));
        System.out.println("The both strings are: "+isEqual);
        sc.close();
    }
} 