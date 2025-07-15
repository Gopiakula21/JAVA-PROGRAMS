import java.util.*;
public class ExceptionalHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter a first Number: ");
            int num1=sc.nextInt();
            System.out.println("you entered "+num1);
            System.out.print("Enter a Second Number: ");
            int num2=sc.nextInt();
            System.out.println("You entered number is: "+num2);
            int result=num1/num2;
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Caught Exception: Division by Zero.....  "+e);
        }
        finally{
            System.out.println("This block of code executes every time");
            sc.close();
        }  
    }      
}
