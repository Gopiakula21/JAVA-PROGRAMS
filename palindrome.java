import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the First String: ");
        String str1=sc.nextLine();
        int start=0;
        int end=str1.length()-1;
        char[] arr=str1.toCharArray();
        int flag=0;
        while(start<end){
            if(arr[start]!=arr[end]){
                System.out.println("Not a palindrome");
                flag=1;
                break;
            }
            else{
                start++;
                end--;
            }
        }
        if(flag==0){
            System.out.println("It is a palindrome");
        }
        sc.close();
        
    }
    
}
