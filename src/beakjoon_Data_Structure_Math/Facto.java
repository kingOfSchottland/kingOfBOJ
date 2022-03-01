package beakjoon_Data_Structure_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Facto {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 0;
        while (n >= 5) {
            num = n / 5;
            n /= 5;
        }
    }

}
