package baekjoon_Algorithm_Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ToOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        int[] val = new int[m];
        Stack<Integer> sta = new Stack<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < val.length; i++) {
            val[i] = Integer.parseInt(st.nextToken());
        }
        int ind = 0;
        int sum = 0;
        for (int i = val.length-1; i >= 0; i--) {
            sum += val[ind] * Math.pow(A, i);
            ind++;
        }
        while (sum >= B) {
            sta.push(sum%B);
            sum /= B;
        }
        sta.push(sum);
        StringBuilder sb = new StringBuilder();
        while (!sta.isEmpty()) {
            sb.append(sta.pop()).append(' ');
        }
        System.out.println(sb);
    }
}
