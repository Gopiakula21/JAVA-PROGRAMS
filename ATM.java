import java.util.*;
public class ATM{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the pin to access: ");
        int pin=sc.nextInt();
        double balance=4560.69;
        if(pin==1234){
            System.out.println("Access Granted");
            System.out.print("Enter the amount to be withdrawl: ");
            double amount=sc.nextDouble();
            if(amount<=balance){
                System.out.println("Withdrawl successfully!!!");
                balance-=amount;
                System.out.printf("Remaining Balance RS: %.2f",balance);
            }
            else{
                System.out.println("Insufficient Balance");
            }
        }
        else{
            System.out.println("Incorrect pin");
        }

        sc.close();


    }
}