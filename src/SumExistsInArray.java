public class SumExistsInArray {
//    Input: arr[] = {0, -1, 2, -3, 1}, x= -2
//    Output: Yes
//    Explanation: If we calculate the sum of the output,1 + (-3) = -2

    // Iterate in 2 loops and compare
    // Compare the index in both the loops and sum the numbers

    public Boolean sumExistsInArray(int[] inputArr, int number){
        for(int i =0 ; i< inputArr.length;i++){
            for(int j =i+1;j<inputArr.length;j++){
                if(inputArr[i]+inputArr[j]== number){
                    return true;
                }
            }
        }
        return false;
    }
}
