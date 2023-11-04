package scenario3;
import java.util.Scanner;

public class Scenario02 {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       
       System.out.println("Enter the first number");
       double a= sc.nextInt();
       System.out.println("Enter your second number");
       double b = sc.nextInt();
       
       double c;
        c = a+b;
        
        System.out.println("Your 1st number is " + a);
        System.out.println("Your 2nd number is " + b);
        System.out.println("The toal number is " + c);
    }
    
}
