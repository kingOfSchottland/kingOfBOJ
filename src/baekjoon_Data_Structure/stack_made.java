package baekjoon_Data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class stack_made {
    static Stack<Integer> st = new Stack<Integer>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String l = st.nextToken();
            if (l.equals("push")) {
                stack(l+" "+st.nextToken());
            } else {
                sb.append(stack(l)).append('\n');
            }
        }
        System.out.println(sb);
    }
    static int stack(String s) {
        String[] sa = s.split(" ");
        int k = 0;
        if (sa[0].equals("push")) {
            st.push(Integer.parseInt(sa[1]));
        } else if (sa[0].equals("pop")) {
            if (st.isEmpty()) {
                k = -1;
            } else {
                k = st.pop();
            }
        } else if (sa[0].equals("size")) {
            k = st.size();
        } else if (sa[0].equals("empty")) {
            if (st.isEmpty()) {
                k = 1;
            } else {
                k = 0;
            }
        } else if (sa[0].equals("top")) {
            if (st.isEmpty()) {
                k = -1;
            } else {
                k = st.get(st.size()-1);
            }
        }
        return k;
    }
}
