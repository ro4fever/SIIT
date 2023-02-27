package javaintro.incourseexercise;


/*
Task - Read numbers from 
keyboard until their sum is 
greater than 20
*/
import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = 0;
        
        do {
            System.out.println("Insert a number");
            num = scan.nextInt();
        } while (num % 2 == 0);
        
        System.out.println("Thee number " + num + " is even" + ".");
    }
}
