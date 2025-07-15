import java.util.*;
public class concatstr{
    public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
      System.out.print("Enter String1: ");
      String str1=sc.nextLine();
      System.out.print("Enter String2: ");
      String str2=sc.nextLine();
      String result=str1+str2;
      System.out.println("The concatinated string is: "+result);
      System.out.println("By using concat function: "+str1.concat(str2));
      sc.close();

    }

}