import java.util.*;
public class Stacks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> books=new Stack<>();
        System.out.print("Enter the Number of books: ");
        int count=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<count;i++){
            System.out.print("Enter the Name of the book "+(i+1)+" : ");
            books.push(sc.nextLine());
        }
        if(!books.isEmpty()){
        System.out.println("The books in the stack from Top->Bootom: "+books);
        System.out.println("The top of the book is : "+books.peek());
        System.out.println("The top of the book removed is : "+books.pop());
        System.out.println("The top of the book after removed is : "+books.peek());
        }
        System.out.println("The book top->bootom is : "+books);
        sc.close();
    }
    
}
