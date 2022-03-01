package beakjoon_Data_Structure_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int gcd = gcd(max, min);
        System.out.println(gcd);
        System.out.println(max*min/gcd);
    }
    static int gcd(int M, int N) {
        if (N == 0) {
            return M;
        }
        return gcd(N, M%N);
    }
}
