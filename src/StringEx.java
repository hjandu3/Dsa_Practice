import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StringEx {

    public Integer longestSubStrWithoutRepeatation(String s){
//        Input: “ABCDEFGABEF”
//        Output: 7
//        Explanation: The longest substring without repeating characters are “ABCDEFG”, “BCDEFGA”, and “CDEFGAB” with lengths of 7

        // Iterate over string and store index of each char, make it negative if it unique, get the unique values, update the count of max length
            for(int i =0; i<s.charAt(i);i++){
                int count = 0;
                int index = Math.abs(s.charAt(i));
                if(s.charAt(index)>0){

                }else{
                    //s.charAt(index) = -s.charAt(index);
                }
            }
//        return 2;
        //O(n^2) Solution
        Integer count =0;
        for(int i=0;i<s.length();i++) {
            HashMap<Character,Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                if (!map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), 1);
                } else {
                    if(count<(j-i)) {
                        count = j-i;
                    }
                    break;
                }
            }
        }
        return count;
    }
}
