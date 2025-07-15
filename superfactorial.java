import java.util.*;
class Supfactorial{
    int factorial(int n){
        int fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;
    }
    return fact;
    }
    long supfact(int num){
        long ft=1;
        for(int i=1;i<=num;i++){
            ft=ft*factorial(i);
        }
        return ft;
    }
    
}
public class superfactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find the super factorial: ");
        int n=sc.nextInt();
        Supfactorial obj=new Supfactorial();
        long result=obj.supfact(n);
        System.out.println("The superfactorial of "+n+" is:"+result);
        sc.close();
    }
    
}
