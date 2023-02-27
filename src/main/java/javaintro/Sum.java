package javaintro;


public class Sum {
    private int j;
    public Sum(int j) {
        this.j = j;
    }
    public int calc() {
        int i, result = 0;
        for (i = 1; i <= this.j; i++) {
            result += i;
        }
        System.out.println("The sum of the first " + this.j + " numbers higher than 0 is " + result + ".");
        return result;
    }
}