public class stringbuffer {
    public static void main(String[]args){
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");
        System.out.println("append():" +sb);

        sb.insert(5, " World");
        System.out.println("insert(): " +sb);

        sb.delete(5, 11);
        System.out.println("delete():" +sb);


        
    }
}
