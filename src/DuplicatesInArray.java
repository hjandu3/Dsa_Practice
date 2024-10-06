import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicatesInArray {

//    Input: n=7 , array[]={1, 2, 3, 6, 3, 6, 1} --> {1+arr.lenth..} i.e. {8,9,
//    Output: 1, 3, 6
//    Explanation: The numbers 1 , 3 and 6 appears more than once in the array.

    public List<Integer> duplicatesInArray(int[] arr){
        int n = arr.length;
        // Increment array elements by 1
        for (int i = 0; i < n; i++) {
            arr[i] += 1;
        }

        // result list
        ArrayList<Integer> res = new ArrayList<>();

        // count variable for count of
        // largest element
        int count = 0;

        for (int i = 0; i < n; i++) {

            // Calculate index value
            int index = Math.abs(arr[i]) > n
                    ? Math.abs(arr[i]) / (n + 1)
                    : Math.abs(arr[i]);

            // Check if index equals largest element value
            if (index == n) {
                count++;
                continue;
            }

            // Get element value at index
            int val = arr[index];

            // Check if element value is negative, positive
            // or greater than n
            if (val < 0) {
                res.add(index - 1);
                arr[index] = Math.abs(arr[index]) * (n + 1);
            }
            else if (val > n)
                continue;
            else
                arr[index] = -arr[index];
        }

        // If largest element occurs more than once
        if (count > 1)
            res.add(n - 1);

        if (res.size() == 0)
            res.add(-1);
        else
            Collections.sort(res);

        return res;
//        List<Integer> duplicates = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            int index = Math.abs(arr[i]) - 1;
//
//            if(arr[index]<0){
//                duplicates.add(arr[index]);
//            }else {
//                arr[index] = -arr[index];
//            }
//
//
//        }
//
//        return duplicates;
    }
}
