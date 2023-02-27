package javaintro;

public class MaxDigit {
    private int n;

    public MaxDigit(int n) {
        this.n = n;
    }

    public int calc() {
        int r, result = 0;
        int num = this.n;
        while (num != 0) {
            r = num % 10;
            num /= 10;
            if (r == 9 || num == 9) {
                result = 9;
                break;
            } else if (r > result) {
                result = r;
            }
        }
        System.out.println("The max digit of " + n + " is " + result + ".");
        return result;
    }
}