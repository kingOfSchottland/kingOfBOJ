package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int N = (V - A) / (A - B);
        if ((V - A) % (A - B) == 0) {
            System.out.println(N + 1);
        } else if((V - A) % (A - B) != 0) {
            System.out.println(N + 2);
        }
    }
}
