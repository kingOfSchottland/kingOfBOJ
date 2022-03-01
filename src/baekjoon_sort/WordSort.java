package baekjoon_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class WordSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> word = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            word.add(br.readLine());
        }
        word = (ArrayList) word.stream().sorted().distinct().collect(Collectors.toList());
        ArrayList<String> words = new ArrayList<String>();
        for (int i = 1; i < 51; i++) {
            for (int j = 0; j < word.size(); j++) {
                if (word.get(j).length() == i) {
                    words.add(word.get(j));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            sb.append(s).append('\n');
        }
        System.out.println(sb);
    }
}
