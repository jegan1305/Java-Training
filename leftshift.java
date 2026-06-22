import java.util.Scanner;
public class leftshift {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();

        System.out.println("enter the shift value:");
        int b = sc.nextInt();
        System.out.println("Left shift = " +(a << b));
        System.out.println("Right shift = " +(a >> b));
}
}
