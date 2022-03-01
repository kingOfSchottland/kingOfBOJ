package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SonIc {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(s.nextToken());
        int b = Integer.parseInt(s.nextToken());
        int c = Integer.parseInt(s.nextToken());
        if (c > b) {
            System.out.println((a / (c - b))+1);
        } else {
            System.out.println(-1);
        }
    }
}
