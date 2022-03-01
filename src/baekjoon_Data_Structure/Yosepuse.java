package baekjoon_Data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Yosepuse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] m = new int[N+1];
        for (int i = 0; i < m.length; i++) {
            m[i] = i;
        }
        int num = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        boolean[] b = new boolean[N+1];
        int l = 0;
        for (int i = 0; i < N; i++) {
            l = 0;
            while (l != K) {
                num++;
                if (num > N) {
                    num -= N;
                }
                if (!b[num]) {
                    l++;
                }
            }
            b[num] = true;
            sb.append(m[num]);
            if (i == N-1) {
                sb.append(">");
            } else {
                sb.append(", ");
            }
        }
        System.out.println(sb);
    }
}
