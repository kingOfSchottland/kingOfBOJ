package beakjoon_Data_Structure_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NToTen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        long cor = 0;
        int ind = 0;
        for (int i = N.length()-1; i >= 0; i--) {
            char c = N.charAt(ind);
            if (c >= 'A') {
                c -= 55;
                cor += c * Math.pow(B, i);
            } else {
                cor += Integer.parseInt(String.valueOf(c)) * Math.pow(B, i);
            }
            ind++;
        }
        System.out.println(cor);
    }
}
