import java.util.*;
public class encap{
    static class Student{
        private String name;
        private int age;
        private double grade;
        public Student(String name,int age,double grade)
        {
            this.name=name;
            this.age=age;
            this.grade=grade;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public double getGrade(){
            return grade;
        }
        public void setName(String Name){
            this.name=name;
        }
        public void setAge(int age){
            if(age>=19)
                this.age=age;
            else
                System.out.println("Student is underaged for graduation grade");
        }
        public void setGrade(double grade){
            if(grade>=0 && grade<=100)
                this.grade=grade;
            else
                System.out.println("Inavlid Grade");
        }
        public void displayDetails(){
            System.out.println("The name of the student is : "+name);
            System.out.println("The age of a student is : "+age);
            System.out.println("The Grade of a student is : "+grade);

        }

    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the details of a student: ");
            System.out.print("Enter the Name of a student: ");
            String name=sc.nextLine();
            System.out.print("Enter the age of a student: ");
            int age=sc.nextInt();
            System.out.print("Enter the grade of a student: ");
            double grade=sc.nextDouble();
            Student obj=new Student(name,age,grade);
            obj.setName(name);
            obj.setAge(age);
            obj.setGrade(grade);
            obj.displayDetails();
            sc.nextLine();
            System.out.println("-------------------Enter the new student details to get updated-----------------------");
            System.out.print("Enter the newName of a student: ");
            String newName=sc.nextLine();
            System.out.print("Enter the newage of a student: ");
            int newAge=sc.nextInt();
            System.out.print("Enter the newgrade of a student: ");
            double newGrade=sc.nextDouble();
            Student obj1=new Student(newName,newAge,newGrade);
            obj1.setName(newName);
            obj1.setAge(newAge);
            obj1.setGrade(newGrade);
            System.out.println("---------------Updated student details are----------------");
            obj1.displayDetails();
            sc.close();
        }
    }
