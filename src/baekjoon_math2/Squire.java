package baekjoon_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Squire {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int x_i = 0;
        int y_i = 0;
        if (x > w) {
            x_i = w - x;
        } else {
            x_i = x;
        }
        if (y > h/2) {
            y_i = h - y;
        } else {
            y_i = y;
        }
        if (x_i >= y_i) {
            System.out.println(y_i);
        } else {
            System.out.println(x_i);
        }
    }
}
