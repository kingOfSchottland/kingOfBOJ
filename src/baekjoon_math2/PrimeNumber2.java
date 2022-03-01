package baekjoon_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int[] ject = new int[N+1];
        for (int i = 0; i < ject.length; i++) {
            ject[i] = i;
        }
        boolean[] isPrime = new boolean[N+1];
        isPrime[0] = true;
        isPrime[1] = true;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                continue;
            }
            for (int j = i*2; j < isPrime.length; j += i) {
                isPrime[j] = true;
            }
        }
        int count = 0;
        int all = 0;
        for (int i = N; i >= M; i--) {
            if (!isPrime[i]) {
                all += ject[i];
                count = i;
            }
        }
        if (all == 0) {
            System.out.println(-1);
        } else {
            System.out.printf("%d\n%d", all, count);
        }
    }
}
