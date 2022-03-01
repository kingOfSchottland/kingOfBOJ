package baekjoon_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GuessOfGoldBahh2 {
    public static Boolean[] isPrime = new Boolean[10001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        primeConduct();

        int num = Integer.parseInt(br.readLine());

        while (num-- > 0) {
            int even = Integer.parseInt(br.readLine());
            int first = even / 2;
            int second = even / 2;

            while (true) {

                if (!isPrime[first] && !isPrime[second]) {
                    sb.append(first).append(' ').append(second).append('\n');
                    break;
                }
                first--;
                second++;
            }
        }
        System.out.print(sb);
    }

    public static void primeConduct() {
        Arrays.fill(isPrime, false);
        isPrime[0] = true;
        isPrime[1] = true;
        for (int j = 2; j <= Math.sqrt(isPrime.length); j++) {
            if (isPrime[j]) {
                continue;
            }
            for (int k = j * j; k < isPrime.length; k += j) {
                isPrime[k] = true;
            }
        }
    }
}
