package baekjoon;

import java.util.Scanner;

public class Croatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split("");
        System.out.println(croac(tmp));
    }
    static int croac(String[] tmp) {
        int count = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (i != tmp.length - 1) {
                if (tmp[i].equals("c")) {
                    if (tmp[i+1].equals("=") || tmp[i+1].equals("-")) {
                        i++;
                    }
                } else if (tmp[i].equals("d")) {
                    if (tmp[i+1].equals("z") && i != tmp.length-2) {
                        if (tmp[i+2].equals("=")) {
                            i += 2;
                        }
                    } else if (tmp[i+1].equals("-")) {
                        i++;
                    }
                } else if (tmp[i].equals("l")) {
                    if (tmp[i+1].equals("j")) {
                        i++;
                    }
                } else if (tmp[i].equals("n")) {
                    if (tmp[i+1].equals("j")) {
                        i++;
                    }
                } else if (tmp[i].equals("s")) {
                    if (tmp[i+1].equals("=")) {
                        i++;
                    }
                } else if (tmp[i].equals("z")) {
                    if (tmp[i+1].equals("=")) {
                        i++;
                    }
                }
            }
            count++;
        }
        return count;
    }
}
