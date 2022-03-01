package baekjoon_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (true) {
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            int dex = Math.max(a,Math.max(b,c));;
            if (dex == a) {
                if (Math.pow(c,2) + Math.pow(b,2) == Math.pow(a,2)) {
                    sb.append("right\n");
                } else {
                    sb.append("wrong\n");
                }
            } else if (dex == b) {
                if (Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2)) {
                    sb.append("right\n");
                } else {
                    sb.append("wrong\n");
                }
            } else {
                if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
                    sb.append("right\n");
                } else {
                    sb.append("wrong\n");
                }
            }
            st = new StringTokenizer(br.readLine());
        }
        System.out.println(sb);
    }
}
