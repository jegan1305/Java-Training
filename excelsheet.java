import java.util.*;
public class excelsheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        String s = "";
        while (n > 0) {
            n--;
            s = (char)('A' + n % 26) + s;
            n = n / 26; 
    }
       System.out.println(s);
}
}
