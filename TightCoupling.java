import java.util.*;
class DotMatrixPrinter{
    public void print(String content){
        System.out.println("Printing with dot matrix "+content);
    }
}
class PrintManager{
    DotMatrixPrinter printer=new DotMatrixPrinter();
    public void printDocument(String content){
        printer.print(content);
    }
}
public class TightCoupling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a document content:");
        String cont=sc.nextLine();
        PrintManager manager=new PrintManager();
        manager.printDocument(cont);
        sc.close();

    }
    
}
