import java.util.*;

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Edge case
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
