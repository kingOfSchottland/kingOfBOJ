package baekjoon_Data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Que {
    static Queue<Integer> qe = new LinkedList();
    static StringBuilder sb = new StringBuilder();
    static int num = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            que(br.readLine());
        }
        System.out.println(sb);
    }

    static void que(String s) {
        String[] k = s.split(" ");
        switch (k[0]) {
            case "push":
                qe.add(Integer.parseInt(k[1]));
                num = Integer.parseInt(k[1]);
                break;
            case "pop":
                if (!qe.isEmpty()) {
                    sb.append(qe.poll()).append('\n');
                } else {
                    sb.append("-1").append('\n');
                }
                break;
            case "size":
                sb.append(qe.size()).append('\n');
                break;
            case "empty":
                if (qe.isEmpty()) {
                    sb.append("1").append('\n');
                } else {
                    sb.append("0").append('\n');
                }
                break;
            case "front":
                if (!qe.isEmpty()) {
                    sb.append(qe.peek()).append('\n');
                } else {
                    sb.append("-1").append('\n');
                }
                break;
            case "back":
                if (!qe.isEmpty()) {
                    sb.append(num).append('\n');
                } else {
                    sb.append("-1").append('\n');
                }
                break;
            default:
                break;
        }
    }
}
