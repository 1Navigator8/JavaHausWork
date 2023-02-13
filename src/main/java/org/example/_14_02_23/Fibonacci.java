package org.example._14_02_23;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//НАПИСАТЬ 3-МЯ СПОСОБАМИ [просто цикл, стримом, рекурсией]
public class Fibonacci {
            public static void main(String[] args) {
            System.out.println(findFibonacciLoop(5));
            System.out.println(findFibonacciLoop(8));
            System.out.println(findFibonacciStream(5));
            System.out.println(findFibonacciStream(8));
            System.out.println(findFibonacciRecur(5));
            System.out.println(findFibonacciRecur(8));
        }
        public static int findFibonacciLoop(int n) {
            if (n < 2) {
                return n;
            }
            int prev = 0;
            int curr = 1;
            for (int i = 2; i <= n; i++) {
                int temp = prev + curr;
                prev = curr;
                curr = temp;
            }
            return curr;
        }

        public static int findFibonacciStream(int n) {
            return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                    .limit(n+1)
                    .map(s -> s[0])
                    .reduce((x, y) -> y)
                    .orElse(0);
        }

        public static int findFibonacciRecur(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return findFibonacciRecur(n - 1) + findFibonacciRecur(n - 2);
            }
        }
    }

