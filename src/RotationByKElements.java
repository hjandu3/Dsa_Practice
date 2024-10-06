public class RotationByKElements {

    public void rotateArrayByKEle(int[] arr, int k){
        if(k ==0){
            return;
        }
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        rotateArrayByKEle(arr,k-1);
    }
}
