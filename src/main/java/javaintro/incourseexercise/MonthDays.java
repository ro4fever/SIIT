package javaintro.incourseexercise;


/*
Task - display the number of days in a month. 
The month index is read from the keyboard.
*/
import java.util.Date;
import java.util.Scanner;

public class MonthDays {
    
    static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public static boolean isLeapYear(int year) {
        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
        return year % 400 == 0;
    }
    

    public static void main(String[] args) {
        
        Date date = new Date();
        
        int y = (int) date.getTime();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insert the month: ");
        
        int m = 0;
        
        try {
            
            m = scan.nextInt();

            if (m == 2 && isLeapYear(y)) days[m] = 29;

            System.out.println("The number of days for Month nr. " + m + " is " + days[m]);
        }
        
        catch (Exception e) {
            
            System.out.println("Please insert the correct Month!");
        }
    }
}
