package baekjoon_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stars {
    static char[][] star;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        star = new char[N][N];

        starConduct(0, 0, N, false);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(star[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void starConduct(int x, int y, int n, boolean blank) {

        if (blank) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    star[i][j] = ' ';
                }
            }
            return;
        }
        if (n == 1) {
            star[x][y] = '*';
            return;
        }

        int size = n / 3;
        int count = 0;
        for (int i = x; i < x + n; i += size) {
            for (int j = y; j < y + n; j += size) {
                count++;
                if (count == 5) {
                    starConduct(i, j, size, true);
                } else {
                    starConduct(i, j, size, false);
                }
            }
        }
    }
}