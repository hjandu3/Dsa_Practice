package BinarySearch;

public class BinarySearch {

    public int binarySearch(int[] arr,int low, int high, int x){
        if(high>=low) {
            int mid = (low+high) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, low, mid - 1, x);
            } else {
                return binarySearch(arr, mid + 1, high, x);
            }
        }
        return -1;
    }
}
