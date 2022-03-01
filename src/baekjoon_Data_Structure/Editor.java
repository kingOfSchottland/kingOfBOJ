package baekjoon_Data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Editor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> list = new LinkedList<Character>();
        String s = br.readLine();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < s.length(); i++) {
            list.offer(s.charAt(i));
        }
        ListIterator<Character> iter = list.listIterator();
        while (iter.hasNext()) {
            iter.next();
        }
        while (N-- > 0) {
            String w = br.readLine();
            char c = w.charAt(0);
            switch (c) {
                case 'P':
                    iter.add(w.charAt(2));
                    break;
                case 'L':
                    if (iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case 'D':
                    if (iter.hasNext()) {
                        iter.next();
                    }
                    break;
                case 'B':
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                default:
                    break;
            }
        }
        for (char c : list) {
            System.out.print(c);
        }
    }
}
