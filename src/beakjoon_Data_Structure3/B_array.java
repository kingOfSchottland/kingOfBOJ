package beakjoon_Data_Structure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class B_array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        Queue<Character> qe = new LinkedList<>();
        for (char k : c) {
            qe.offer(k);
        }
        String[] l = new String[c.length];
        Arrays.fill(l, "");
        for (int i = 0; i < c.length; i++) {
            Iterator<Character> it = qe.iterator();
            while (it.hasNext()) {
                l[i] += it.next();
            }
            qe.poll();
        }
        Arrays.sort(l);
        for (String s : l) {
            System.out.println(s);
        }
    }
}
