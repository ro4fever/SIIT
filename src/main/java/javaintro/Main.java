package javaintro;

/*
Here you will find the Java implementation of the following algorithms:

1. Calculate the sum of the first 100 numbers higher than 0
2. Display the smallest number from an array of numbers
3. Display the max digit of a number
4. Check if a number is palindrome (e.g palindrome 1221, 34143)
5. Display all the prime numbers lower than a given number
*/

public class Main {

    public static void main(String[] args) {

        Sum sum = new Sum(100);
        sum.calc();

        SmallestNumber small = new SmallestNumber(100);
        small.calc(2147483647);

        MaxDigit digit = new MaxDigit(2147483647);
        digit.calc();

        PalindromeCheck palindrome = new PalindromeCheck(159951);
        palindrome.check();

        Primes prime = new Primes(10000);
        prime.displayPrimes();

    }

}
        