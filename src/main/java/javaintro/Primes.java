package javaintro;

public class Primes {
    private int n;
    public Primes(int n) {
        this.n = n;
    }
    public void displayPrimes() {
        System.out.print("All the prime numbers lower than " + n + " are: ");
        boolean[] prime = new boolean[n + 1];
        for (int b = 0; b < prime.length; b++) {
            prime[b] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int k = 2; k <= n; k++) {
            if (prime[k]) {
                System.out.print(k + " ");
            }
        }
    }
}