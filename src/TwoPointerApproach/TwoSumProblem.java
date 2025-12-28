package TwoPointerApproach;

public class TwoSumProblem {
    // Find the two indexes whose value sum is equal to target

    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,8,9};
        System.out.println(findIndexOfSum(arr,12));
    }

    public static String findIndexOfSum(int[] arr, Integer target)
    {
        int i =0;
        int j= arr.length-1;
        while(i<j) {
            if ((arr[i] + arr[j]) == target) {
                return i + "," + j;
            } else if ((arr[i] + arr[j]) < target) {
                i++;
            } else {
                j++;
            }
        }
        return  "";
    }
}
