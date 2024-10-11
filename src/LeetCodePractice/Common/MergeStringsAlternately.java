package LeetCodePractice.Common;

public class MergeStringsAlternately {

    public static void main(String args[]){
        System.out.println(mergeAlternately("ab","pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {
        char[] smallerArr = word1.length()> word2.length() ? word2.toCharArray() : word1.toCharArray();
        char[] largerArr = word1.length()< word2.length() ? word2.toCharArray() : word1.toCharArray();
        int pointer1 =0;
        int pointer=0;
        char[] wordArr1 = word1.toCharArray();
        char[] wordArr2 = word2.toCharArray();
        char[] arr =  new char[smallerArr.length*2];
        while(pointer1<smallerArr.length){
            arr[pointer++] = wordArr1[pointer1];
            arr[pointer++] = wordArr2[pointer1];
            pointer1++;
        }
        String restStr = (new String(largerArr).substring(smallerArr.length));

        return (new String(arr)).concat(restStr);

    }
}
