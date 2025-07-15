import java.util.*;
public class BasicLinkedSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of fruits: ");
        int num=sc.nextInt();
        sc.nextLine();
        Set<String> fruits=new LinkedHashSet<>();
        for(int i=0;i<num;i++){
            System.out.print("Enter the fruit"+(i+1)+" is : ");
            String str=sc.nextLine();
            fruits.add(str);
        }
        System.out.println("\nUnique fruits: ");
        for(String fruit:fruits){
            System.out.println(fruit);
        }
        sc.close();
        }
    
}
