import java.util.*;
class Animal{
    String name;
    void details(Scanner s)
    {
        System.out.print("Enter animal name: ");
        name = s.nextLine();
    }
    void showanimal() {
        System.out.println("Animal : " + name);
    }
}
class Mammal extends Animal{
    String type;
    void mammaltype(Scanner s){
        System.out.print("Enter the animal type: ");
        type = s.nextLine();
    }
    void showmammal() {
        System.out.println("Mammal Type: " + type);
    }
}
class Dog extends Mammal{
    String breed;
    void breeddetails(Scanner s){
        System.out.print("Enter the dog breed: ");
        breed = s.nextLine();
    }
    void showdog() {
        System.out.println("Dog Breed: " + breed);
    }
}
public class multilevel {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Dog mydog=new Dog();
        mydog.details(s);
        mydog.mammaltype(s);
        mydog.breeddetails(s);
        
        System.out.println("\n-------------------My Dog Details-------------------");
        mydog.showanimal();
        mydog.showmammal();
        mydog.showdog();
    }
}