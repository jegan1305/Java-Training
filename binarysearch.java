public class binarysearch {
    public static void main(String[]args){
        int [] arr = {10, 20, 30, 40, 50, 60};
        int key = 40;
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if (arr[mid]==key){
                System.out.println("Found at index "  +mid);
            }
            else if(arr[mid] < key){
                left = mid + 1;
            }
            System.out.println("Not found");
        }
    }
}
