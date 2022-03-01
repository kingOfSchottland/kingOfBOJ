package beakjoon_Data_Structure_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Binar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        if (N == 0) {
            System.out.println(N);
            System.exit(0);
        }
        while (N != 1) {
            st.push(Math.abs(N%-2));
            N = (int) Math.ceil((double)N/-2);
        }
        st.push(1);
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        System.out.println(sb);
    }
}
