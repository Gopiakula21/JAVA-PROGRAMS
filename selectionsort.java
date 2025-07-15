import java.util.*;
public class selectionsort {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter "+n+" Integers: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        ss(arr);
        System.out.println("Sorted array is: ");
        for(int num:arr)
        sc.close();
    }
    
}
