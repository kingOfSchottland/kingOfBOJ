package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlymetotheAlphaCentauri {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] correct = new int[num];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int count = 1;
            int horse = X+1;
            while (horse < Y-1) {
                if (horse+count+1 <= Y-1) {
                    horse += count+1;
                } else if (horse+count <= Y-1) {
                    horse += count;
                } else {
                    horse += count - 1;
                }
                count++;
            }
            count++;
            correct[i] = count;
        }
        for (int i = 0; i < num; i++) {
            System.out.println(correct[i]);
        }
    }
}
