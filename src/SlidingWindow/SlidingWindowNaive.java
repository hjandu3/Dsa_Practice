package SlidingWindow;

public class SlidingWindowNaive {

    public void maxElementKWindow(int arr[],int k){
        int n =arr.length;
        int max;
        for(int i=0;i<=n-k;i++){
            max = arr[i];
                    for(int j=1;j<k;j++){
                        if(max<arr[j+i]){
                            max= arr[j+i];
                        }
                    }
                    System.out.print(max + " ");
        }
    }
}
