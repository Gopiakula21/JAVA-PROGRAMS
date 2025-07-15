import java.util.*;
class Student1{
    String name;
    int roll;
    String grade;
    Student1(){
        this.name="not known";
        this.roll=1;
        this.grade="E";
    }
    Student1(String name,int roll){
        this.name=name;
        this.roll=roll;
        this.grade="not known";
    }
    Student1(String name,int roll,String grade){
        this.name=name;
        this.roll=roll;
        this.grade=grade;
    }
    void displayStudent(){
        System.out.println("--------These are the details of students----");
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Grade: "+grade);
    }
}
public class Coverload {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Name: ");
        String str1=sc.nextLine();
        System.out.print("Enter a Roll: ");
        int num=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a Grade: ");
        String str2=sc.nextLine();
        Student1 obj=new Student1();
        obj.displayStudent();
        Student1 obj1=new Student1(str1,num);
        obj1.displayStudent();
        Student1 obj2=new Student1(str1,num,str2);
        obj2.displayStudent();
        
    }
    
}
