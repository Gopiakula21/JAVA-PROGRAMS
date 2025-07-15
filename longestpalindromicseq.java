import java.util.*;
public class longestpalindromicseq {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input=scanner.nextLine();
        len=input.length()
        int left=0;
        int right=len-1;
        int max=1;
        char[] arr=input.toCharArray();
        while(left<=len-1){
            if(arr[left]==arr[right]){
                int flag=0;
                while(left<right){
                    if(arr[left]!=arr[right]){
                        flag=1;
                        break;
                    }
                    else{
                        left++;
                        right--;
                    }
                    if(flag==0){
                        max=
                    }
                }
            }
             

            
        }


    }
    
}
