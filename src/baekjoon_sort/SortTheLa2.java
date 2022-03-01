package baekjoon_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SortTheLa2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] yx = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            yx[i][0] = Integer.parseInt(st.nextToken());
            yx[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(yx, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(yx[i][0]).append(' ').append(yx[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
