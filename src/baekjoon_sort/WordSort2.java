package baekjoon_sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class WordSort2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        for (int i = 0; i < words.length; i++) {
            words[i] = br.readLine();
        }
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append(words[0]).append('\n');
        for (int i = 1; i < words.length; i++) {
            if (!words[i].equals(words[i-1])) {
                sb.append(words[i]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
