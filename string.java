public class string {
    public static void main(String[]args){
        String str =  "  Hello world java  ";
        String str2 = "  Hello world java  ";
        System.out.println("Length = " + str.length());
        System.out.println("Character at index 2 = " +str.charAt(2));
        System.out.println("Substring(2, 7) = " +str.substring(2,7));

        System.out.println("Str equals str = " +str.trim().equals(str2));
        System.out.println("contains 'java' = " +str.contains("java"));

        

    }
}
