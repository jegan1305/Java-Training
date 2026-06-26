import java.util.*;
public class winingplayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int n = sc.nextInt();
        int[] score = new int[n];
        System.out.println("Enter scores:");
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        int index = 0;

        for (int i = 1; i < score.length; i++) {
            if (score[i] > score[index]) {
                index = i;
            }
        }

        System.out.println(index);
    }
}

