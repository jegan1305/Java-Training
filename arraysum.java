public class arraysum {
    public static void main(String[]args){
        int[] arr = {2,7,11,15};
        int key = 9;
        for(int i = 0; i<arr.length; i++){
            for(int j = i + 1; j<arr.length; j++){
                if(arr[i] + arr[j] == key){
                    System.out.println(+arr[i]+" " +arr[j]);
                }
            }
        }
    }
}
