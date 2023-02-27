package javaintro.incourseexercise;


import java.lang.Math;

public class CosSinMath
{
    public static void main(String[] args) {
        int x = 1454564227;
        double result = Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2);
        System.out.println("The result is: " + result);
    }
}