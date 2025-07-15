import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
public class Lambdafun {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        Function<Integer,Integer>square= (n)-> n*n;
        Predicate<Integer>isEven=(n)-> n%2==0;
        Consumer<Integer>display=(n)->System.out.println("result: "+n);
        if(isEven.test(number)){
            int result=
            square.apply(number);
            display.accept(result);
        }
        else{
            System.out.println("Enter a even Number");
        }
        sc.close();
    }

    
}
