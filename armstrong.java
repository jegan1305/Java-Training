import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int x = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while(num>0){
            int d = num%10;
            sum+=Math.pow(d,digits);
            num/=10;
        }
        if(sum==x){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
