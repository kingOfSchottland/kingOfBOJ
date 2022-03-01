package baekjoon_Data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class VPS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            String s = br.readLine();
            Stack<Character> st = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                st.push(s.charAt(i));
            }
            int left = 0;
            int right = 0;
            while (!st.isEmpty()) {
                if (st.pop() == ')') {
                    right++;
                } else {
                    left++;
                }
                if (left > right) {
                    sb.append("NO").append('\n');
                    break;
                }
            }
            if (left == right) {
                sb.append("YES").append('\n');
            } else if (left < right){
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }
}
