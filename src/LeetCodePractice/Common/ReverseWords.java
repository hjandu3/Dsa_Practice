//package LeetCodePractice.Common;
//
//
//public class ReverseWords {
//    public static void main(String args[]){
//        System.out.println(reverseWords("a good            example"));
//
//
//    }
//
//    public static String reverseWords(String s){
//        String[] strArr = s.trim().split(" ");
//        String[] resultant = new String[strArr.length];
//        for(int i =strArr.length-1;i>0;i--){
//            if(!strArr[i].equals(""))
//                resultant[i] = strArr[i].trim() + " ";
//        }
//        resultant[0] = strArr[strArr.length-1];
//
//        return stringBuilder.toString();
//    }
//}
