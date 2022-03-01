package baekjoon_Data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Deck {
    static Stack<Integer> st = new Stack<Integer>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String s = br.readLine();
            deck(s);
        }
        System.out.println(sb);
    }

    public static void deck(String s) {
        String[] k = s.split(" ");
        if (k[0].equals("push_back")) {
            st.push(Integer.parseInt(k[1]));
        } else if (k[0].equals("push_front")) {
            st.add(0, Integer.parseInt(k[1]));
        } else if (k[0].equals("pop_front")) {
            if (!st.isEmpty()) {
                sb.append(st.get(0)).append('\n');
                st.remove(0);
            } else {
                sb.append(-1).append('\n');
            }
        } else if (k[0].equals("pop_back")) {
            if (!st.isEmpty()) {
                sb.append(st.pop()).append('\n');
            } else {
                sb.append(-1).append('\n');
            }
        } else if (k[0].equals("size")) {
            sb.append(st.size()).append('\n');
        } else if (k[0].equals("empty")) {
            if (!st.isEmpty()) {
                sb.append(0).append('\n');
            } else {
                sb.append(1).append('\n');
            }
        } else if (k[0].equals("front")) {
            if (!st.isEmpty()) {
                sb.append(st.get(0)).append('\n');
            } else {
                sb.append(-1).append('\n');
            }
        } else {
            if (!st.isEmpty()) {
                sb.append(st.peek()).append('\n');
            } else {
                sb.append(-1).append('\n');
            }
        }
    }
}
