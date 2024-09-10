import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrimeFactorization o = new PrimeFactorization();
        int n;
        System.out.println("Enter Number: ");
        n = in.nextInt();
        System.out.print("The Prime Factors of " + n + " are: ");
        o.primefac(n);
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void primefac(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && n % i == 0) {
                System.out.print(i + " ");
                n /= i;
                i--;
            }
        }
    }
}
