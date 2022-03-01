package beakjoon_Data_Structure_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldBah {
    static boolean[] isPrime = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        conduct();
        while (N-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int num = 0;
            int left = n/2;
            int right = n/2;
            for (int i = n/2; i >= 1; i--) {
                if (!isPrime[left] && !isPrime[right]) {
                    num++;
                }
                left--;
                right++;
            }
            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }
    static void conduct() {
        isPrime[0] = true;
        isPrime[1] = true;
        for (int i = 2; i <= Math.sqrt(isPrime.length); i++) {
            if (isPrime[i]) {
                continue;
            }
            for (int j = i * i; j < isPrime.length; j += i) {
                isPrime[j] = true;
            }
        }
    }
}
