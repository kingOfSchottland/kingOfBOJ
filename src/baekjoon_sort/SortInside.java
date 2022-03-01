package baekjoon_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] count = br.readLine().toCharArray();
        Arrays.sort(count);
        for (int i = count.length-1; i >= 0; i--) {
            System.out.print(count[i]);
        }
    }
}
