package beakjoon_Data_Structure_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HideAndSeek {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] n = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            n[i] = Math.abs(S - Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(n);
        int l = n[0];
        for (int i = 1; i < N; i++) {
            l = gcd(l, n[i]);
        }
        System.out.println(l);
    }
    static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m%n);
    }
}
