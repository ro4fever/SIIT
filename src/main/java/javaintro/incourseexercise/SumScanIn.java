package javaintro.incourseexercise;


/*
Task - Read numbers from 
keyboard until their sum is 
greater than 20
*/
import java.util.Scanner;

public class SumScanIn
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        
        while (sum <= 20) {
            
            System.out.println("Insert a number");
            
            sum += scan.nextInt();
            
            System.out.println("Sum is: " + sum);
        }
        
    }
}
