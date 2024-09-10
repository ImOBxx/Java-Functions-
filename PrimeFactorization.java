import java.util.Scanner;

public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrimeFactorization o = new PrimeFactorization();
        System.out.println("Enter Number: ");
        int i = in.nextInt();
        System.out.print("The Prime Factors Are: ");
        o.check(i);
    }

    boolean isPrime(int i) {
        if (i <= 1) return false;
        for (int k = 2; k * k <= i; k++) {
            if (i % k == 0) return false;
        }
        return true;
    }

    void check(int x) {
        for (int i = 2; i <= x; i++) {
            while (x % i == 0 && isPrime(i)) {
                System.out.print(i + " ");
                x /= i;
            }
        }
    }
}
