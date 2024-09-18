package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prime_number{

    /*
     * For a given number n, check if it is prime or not.
     * A prime number is a number that is only divisible by 1 and itself.
     *
     * Examples:
     * Input: n = 5
     * Output: 1 (5 is prime)
     * Input: n = 25
     * Output: 0 (25 is not prime)
     */

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}

class Solution {
    static int isPrime(int N) {
        if (N <= 1) return 0;
        if (N <= 3) return 1;
        if (N % 2 == 0 || N % 3 == 0) return 0;



        for (int i = 5; i * i <= N; i += 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return 0;
            }
        }
        return 1;
    }
}
