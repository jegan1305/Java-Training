import java.util.Scanner;
    public class largestodd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String s = sc.nextLine();

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = s.charAt(i) - '0';

            if (digit % 2 != 0) {
                ans = s.substring(0, i + 1);
                break;
            }
        }

        System.out.println("Largest Odd Number: " + ans);
    }

}
