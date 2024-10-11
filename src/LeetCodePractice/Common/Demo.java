package LeetCodePractice.Common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static  void  main(String[] args){
        String[] arr = {"apple","sample", "search","cat"};
        System.out.println(firstCharacter(arr));
        int[] a = new int[] {4, 2, 5, 1};
    int[] b = new int[] {8, 1, 9, 5};

        int[] res = mergeSortedArrays(a,b);
        for(int i =0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }

//    Write a program to print all String which starts as "S" from the given String array.
//
//            Ex:
//
//    Input: {"apple","sample", "search","cat"}
//
//    output: { "sample", "search"}

    public static List<String> firstCharacter(String[] strArr){
        List<String> str = new ArrayList<>();

        for(int i=0;i<strArr.length;i++){
            if(strArr[i].charAt(0)=='s'){
                str.add(strArr[i]);
            }
        }
        return str;
    }

//    you merge two unsorted arrays into single sorted array without duplicates?
//
//    int[] a = new int[] {4, 2, 5, 1};
//    int[] b = new int[] {8, 1, 9, 5};

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2){
        int[] result = new int[arr2.length+arr1.length];

        System.arraycopy(arr1,0,result,0,arr1.length);
        System.arraycopy(arr2,0,result,arr1.length,arr2.length);

//        for(int i=0;i<arr1.length;i++){
//            result[i] = arr1[i];
//        }
//        int counter=0;
//        for(int i=arr1.length;i<arr2.length;i++){
//            result[i] = arr2[counter++];
//        }
        result = Arrays.stream(result).distinct().toArray();
        Arrays.sort(result);
        return result;

    }


}
