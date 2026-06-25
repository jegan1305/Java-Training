public class calculator{
    static int add(int a, int b){
        return a + b;
    }
    static int multiply(int a, int b){
        return a * b;
    }
    static int subract(int a, int b){
        return a - b;
    }
    static int div(int a, int b){
        return a / b;
    }
    public static void main(String[]args){
        System.out.println(add(5, 3));
        System.out.println(multiply(5, 3));
        System.out.println(subract(5, 3));
        System.out.println(div(5, 3));
    }
}
