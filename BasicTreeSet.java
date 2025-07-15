import java.util.*;
public class BasicTreeSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the how many numbers: ");
        int num=sc.nextInt();
        TreeSet<Integer> numbers=new TreeSet<>();
        for(int i=0;i<num;i++){
            System.out.print("Enter the number "+(i+1)+" is: ");
            int n=sc.nextInt();
            numbers.add(n);
        }
        System.out.println("The Updated Tree set is: ");
        for(int nums:numbers){
            System.out.println(nums);
        }
        sc.close();
    }
    
}
