import java.util.*;
interface Printer{
    void print(String content);
}
class LaserPrinter implements Printer{
    public void print(String content){
    System.out.println("Laser Printer Output: "+content);
    }
}
class InkjetPrinter implements Printer{
    public void print(String content){
        System.out.println("InkjetPrinter: "+content);
    }
}
class PrinterManager{
    Printer printer;
    public PrinterManager(Printer printer){
        this.printer=printer;
    }
    public void printDocument(String content){
        printer.print(content);
    }
}
public class LooseCoupling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a document: ");
        String doc=sc.nextLine();
        System.out.println("Choose printer(1.Laser 2. Inkjet)");
        int choice=sc.nextInt();
        Printer printer;
        if(choice==1){
            printer=new LaserPrinter();
        }else{
            printer=new InkjetPrinter();
        }
        PrinterManager manager=new PrinterManager(printer);
         manager.printDocument(doc);
        sc.close();


    }
    
}
