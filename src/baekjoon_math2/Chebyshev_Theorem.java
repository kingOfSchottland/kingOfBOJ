package baekjoon_math2;

import java.io.*;
import java.util.Arrays;

public class Chebyshev_Theorem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while ((num = Integer.parseInt(br.readLine())) != 0) {
            count = 0;
            Boolean[] isPrime = new Boolean[2*num+1];
            Arrays.fill(isPrime, false);
            isPrime[0] = true;
            isPrime[1] = true;
            for (int i = 2; i <= Math.sqrt(2*num); i++) {
                if (isPrime[i]) {
                    continue;
                }
                for (int j = i*2; j < isPrime.length; j += i) {
                    isPrime[j] = true;
                }
            }
            for (int l = num+1; l < isPrime.length; l++) {
                if (!isPrime[l]) {
                    count++;
                }
            }
            sb.append(count+"\n");
        }
        System.out.println(sb);
    }
}
