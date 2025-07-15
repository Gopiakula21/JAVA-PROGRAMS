import java.util.*;
public class userAndPass{
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a username: ");
        String str1=sc.nextLine();
        System.out.print("Enter a password: ");
        String str2=sc.nextLine();
        if(str1.equals("gopi")){
            if(str2.equals("Gopi@1234")){
                System.out.println("Login Successfully");
            }
            else{
                System.out.println("Wrong Password");
            }
        }
        else{
                System.out.println("Wrong UserName");
            }
   }
}
