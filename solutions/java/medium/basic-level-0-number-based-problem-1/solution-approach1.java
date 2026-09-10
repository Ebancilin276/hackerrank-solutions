// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/seed-it-sde-c-level-0-1-number-based-problems/challenges/basic-level-0-number-based-problem-1/problem?isFullScreen=true
// Problem     Basic_Level_0_Number_Based_Problem_1
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-10, 11:29 a.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Main {

    static long reverse(long n) {
        long rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();

        long square = num * num;
        long revNum = reverse(num);
        long revSquare = revNum * revNum;

        if (square == reverse(revSquare))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
