import java.util.*;
public class array1{
    public static void main(String[] args){
        int[] numbers={77,85,64,2,34};
        int sum=0;
        Arrays.sort(numbers);
        System.out.print("Sorted Array is :");
        for(int num:numbers){
            System.out.print(num+" ");
        }
        for(int num:numbers){
            sum+=num;
        }
        System.out.println();
        System.out.println("The Sum is: "+sum);

    }
}
