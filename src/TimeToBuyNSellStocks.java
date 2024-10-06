public class TimeToBuyNSellStocks {
//    Input: prices[] = {7, 1, 5, 3, 6, 4}
//    Output: 5

//    The lowest price of the stock is on the 2nd day, i.e. price = 1. Starting from the 2nd day, the highest price of the stock is witnessed on the 5th day, i.e. price = 6.
//    Therefore, maximum possible profit = 6 – 1 = 5.
    // loop it twice. compare the outer loop with inner loop, if outer loop value is smaller than the inner loop element value,
    // set the difference to the max sum, comparing if it is greater than the previous value

    public Integer maximumProfit(int[] arr){
        int maxProfit =0;
        int buy = arr[0];
//        for(int i =0;i<arr.length;i++){
//            for(int j =i+1;j<arr.length-1;j++){
//                if(arr[j]-arr[i]>maxProfit){
//                    maxProfit = arr[j]-arr[i];
//                }
//            }
//        }

        for(int i =1;i<arr.length;i++){
            if(buy>arr[i]){
                buy = arr[i];
            }else if(maxProfit<arr[i]-buy){
                maxProfit = arr[i]-buy;
            }
        }
        return maxProfit;
    }
}
