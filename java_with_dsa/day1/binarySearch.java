
public class binarySearch {
    public static void main(String[] args) {
        // binary search
            
        int[] arr = {2,4,5,6,11,15,16};
        int key = 15;
        int result = binarySearchArr(arr, key);
        System.out.println(result);
    }
    public static int binarySearchArr(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        int returnValue = -1;

        while(start<end){
            int mid = start + (end - start)/2;

            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                end = mid -1;
                
            }else{
                start = mid + 1;
            }
        }
        return returnValue;
    }   
}