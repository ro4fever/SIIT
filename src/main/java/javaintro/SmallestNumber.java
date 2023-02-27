package javaintro;


import java.lang.Math;

public class SmallestNumber {
    private int i;
    private int[] array;
    public SmallestNumber(int i) {
        this.i = i;
        array = new int[this.i];
    }
    public int calc(int maxNum) {
        int result = maxNum;
        for (int j = 0; j < array.length; j++) {
            array[j] = (int)(Math.random() * maxNum) + 1;
            if (array[j] < result) {
                result = array[j];
            }
        }
        System.out.println("The smallest number from an array of " + i + " random numbers is " + result + ".");
        return result;
    }
}