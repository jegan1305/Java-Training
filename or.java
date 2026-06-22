import java.util.*;
public class or {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int a = sc.nextInt();

        System.out.println("enter a second number:");
        int b = sc.nextInt();

        int result = a | b;
        System.out.println("Bitwsie OR = " +result);

    }
}