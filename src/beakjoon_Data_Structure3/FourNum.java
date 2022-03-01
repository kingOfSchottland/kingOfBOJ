package beakjoon_Data_Structure3;

import java.io.*;
import java.util.StringTokenizer;

public class FourNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        String C = st.nextToken();
        String D = st.nextToken();
        String a = A+B;
        String b = C+D;
        System.out.println(Long.parseLong(a)+Long.parseLong(b));
    }
}
