package studetails;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your full name with initial:");
        String name = obj.nextLine();   

        System.out.println("Enter your roll number:");
        int rollno = obj.nextInt();     

        System.out.println("Enter your Grade:");
        char grade = obj.next().charAt(0);  
        System.out.println("Enter your percentage:");
        String percentage = obj.next();     

        
        System.out.println("\n=== Student Details ===");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollno);
        System.out.println("Grade      : " + grade);
        System.out.println("Percentage : " + percentage);

       
    }
}
