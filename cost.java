public class cost {
    public static void main(String[]args){
        int[] arr ={10, 20, 5, 40, 15};
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min=arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}