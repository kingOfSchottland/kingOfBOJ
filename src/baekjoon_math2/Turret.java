package baekjoon_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Turret {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int jo_x = Integer.parseInt(st.nextToken());
            int jo_y = Integer.parseInt(st.nextToken());
            int jo_d = Integer.parseInt(st.nextToken());
            int be_x = Integer.parseInt(st.nextToken());
            int be_y = Integer.parseInt(st.nextToken());
            int be_d = Integer.parseInt(st.nextToken());
            int dis = (int) Math.sqrt((jo_x - be_x)*(jo_x - be_x) + (jo_y - be_y)*(jo_y - be_y));
            if (jo_d + be_d > dis) {
                if (Math.abs(jo_d - be_d) < dis) {
                    sb.append("2\n");
                } else if (Math.abs(jo_d - be_d) == dis) {
                    if (dis == 0) {
                        sb.append("-1\n");
                    } else {
                        sb.append("1\n");
                    }
                } else {
                    sb.append("0\n");
                }
            } else if (jo_d + be_d == dis) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.println(sb);
    }
}
