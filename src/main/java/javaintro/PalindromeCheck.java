package javaintro;

public class PalindromeCheck {
    private int n;
    public PalindromeCheck(int n) {
        this.n = n;
    }
    public void check() {
        String s = String.valueOf(this.n);
        String revS = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            revS = ch + revS;
        }
        if (s.equals(revS)) {
            System.out.println("The number " + this.n + " is a palindrome number" + ".");
        } else System.out.println("The number " + this.n + " isn't a palindrome number" + ".");
    }
}