package beakjoon_Data_Structure_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Namurge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append((A+B)%C).append('\n');
        sb.append(((A%C) + (B%C))%C).append('\n');
        sb.append((A*B)%C).append('\n');
        sb.append(((A%C) * (B%C))%C).append('\n');
        System.out.println(sb);
    }
}
