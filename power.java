import java.util.Scanner;
public class power {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if ((n & (n - 1))==0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}

