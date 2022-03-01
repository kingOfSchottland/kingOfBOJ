package baekjoon_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ject = new int[num];
        int count = 0;
        for (int i = 0; i < num; i++) {
            ject[i] = Integer.parseInt(st.nextToken());
            if (ject[i] == 1) {
                ject[i] = 0;
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 2; j < ject[i]; j++) {
                if (ject[i] % j == 0) {
                    ject[i] = 0;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            if (ject[i] == 0) {
                count++;
            }
        }
        System.out.println(num - count);
    }
}
