import java.util.*;
public class vector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many numbers you want: ");
        int num=sc.nextInt();
        Vector<Integer> numbers=new Vector<>();
        for(int i=0;i<num;i++){
            System.out.print("Entered Number is "+(i+1)+" : ");
            numbers.add(sc.nextInt());
        }
        int sum=0;
        for(int nu:numbers){
            sum+=nu;
        }
        double avg=(sum>0)?(double)sum/num:0;
        System.out.println("\n Number entered: "+numbers);
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
    }
}
