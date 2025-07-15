import java.util.*;
@FunctionalInterface
interface Hi{
    void sayHello(String Name);
}
public class funinterface {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name:  ");
        String name=sc.nextLine();
        Hi greeting=(n)->System.out.println("Hello, "+ n +" Good Morning");
        greeting.sayHello(name);
        sc.close();
    }
    
}
