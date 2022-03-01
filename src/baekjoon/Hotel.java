package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Hotel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] correct = new String[num];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int weight = N / H + 1;
            int height = N % H;
            if (height == 0) {
                height = H;
                weight -= 1;
            }
            correct[i] = String.format("%d0%d", height, weight);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(correct[i]);
        }
    }
}
