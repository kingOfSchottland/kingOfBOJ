package baekjoon_Data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class An {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] op = new int[N+1];
        int[] kl = new int[N];
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i <= N; i++) {
            op[i] = i;
        }
        for (int i = 0; i < kl.length; i++) {
            kl[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 1; i <= kl[0]; i++) {
            st.push(i);
            sb.append("+").append('\n');
        }
        st.pop();
        sb.append("-").append('\n');
        int max = kl[0];
        for (int i = 1; i < kl.length; i++) {
            if (kl[i-1] > kl[i]) {
                if (st.peek() == kl[i]) {
                    sb.append("-").append('\n');
                    st.pop();
                } else {
                    System.out.println("NO");
                    System.exit(0);
                }
            } else {
                for (int j = max; j < kl[i]; j++) {
                    st.push(j+1);
                    sb.append("+").append('\n');
                }
                max = kl[i];

                st.pop();
                sb.append("-").append('\n');
            }
        }
        System.out.println(sb);
    }
}
