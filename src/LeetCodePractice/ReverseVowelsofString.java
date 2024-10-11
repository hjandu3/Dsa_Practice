package LeetCodePractice;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsofString {

//    Given a string s, reverse only all the vowels in the string and return it.
//
//    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//    Input: s = "IceCreAm"
//
//    Output: "AceCreIm"
//
//    Explanation:
//
//    The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm"

    public static void main(String args[]){
        System.out.println(reverseVowelsOptimised("IceCreAm"));
    }

    public static String reverseVowelsOptimised(String s){
        int start =0;
        int end = s.length()-1;
        char[] strChars = s.toCharArray();
        String vowels = "aeiouAEIOU";

        while(start<end){
            while(start<end && vowels.indexOf(strChars[start])==-1){
                start++;
            }
            while(start<end && vowels.indexOf(strChars[end])==-1){
                end--;
            }
            // Swap the characters
            Character swap = strChars[start];
            strChars[start] = strChars[end];
            strChars[end] = swap;
            start++;
            end--;
        }
        return new String(strChars);

    }

    public static String reverseVowels(String str){
        int len = str.length();
        List<Character> vowels = new ArrayList<>();
        for(int i=0;i<len;i++) {
            Character currentChar = str.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
                    || currentChar == 'u' || currentChar == 'A' || currentChar == 'E' || currentChar == 'I'
                    || currentChar == 'O' || currentChar == 'U') {
                vowels.add(currentChar);
            }
        }
        int count =0;
        for(int i= len-1;i>=0;i--){
            Character currentChar = str.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o'
                    || currentChar == 'u' || currentChar == 'A' || currentChar == 'E' || currentChar == 'I'
                    || currentChar == 'O' || currentChar == 'U') {
                str= str.substring(0,i)+vowels.get(count)+ str.substring(i+1);
                count++;
            }

        }
        return str;
    }
}
