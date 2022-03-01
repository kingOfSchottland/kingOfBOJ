package baekjoon_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MovieDirector {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] kol = new int[10000];
        kol[0] = 666;
        int i = 1;
        int j = 1665;
        while (i < 10000) {
            String s = String.valueOf(j);
            int l = 0;
            if (s.contains("666")) {
                kol[i] = j;
                i++;
            }
            j++;
        }
        System.out.println(kol[N-1]);
    }
}
