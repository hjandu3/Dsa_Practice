package LeetCodePractice.Common;

import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String args[]){
        System.out.println(isAnagram("listen","silent"));


    }

    public static boolean isAnagram(String s1, String s2){
        int[] freq = new int[26];

        if(s1.length()!=s2.length()){
            return false;
        }

        for(char c : s1.toCharArray()){
            freq[c-'a']++;
        }

        for(char c : s2.toCharArray()){
            freq[c-'a']--;
        }

        for(int i =0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }

        return true;
    }
}
