package scenario3;
import java.util.Scanner;

public class Scenario01 {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       
       System.out.println("Enter the first number");
       int a= sc.nextInt();
       System.out.println("Enter your second number");
       int b = sc.nextInt();
       
        int c;
        c = a+b;
        
        System.out.println("Your 1st number is " + a);
        System.out.println("Your 2nd number is " + b);
        System.out.println("The toal number is " + c);
    }
    
}






