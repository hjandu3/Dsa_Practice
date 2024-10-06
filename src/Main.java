import BinarySearch.BinarySearch;
import SlidingWindow.AVLTreeSlidingWindow;
import SlidingWindow.DequeSlidingWindow;
import SlidingWindow.SlidingWindowNaive;
import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

import java.beans.BeanProperty;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class Main {


    public static void main(String[] args) {

//        Bank Account Service
//
//        Create service / function to support bank account operations
//
//        Create Bank Account
//        Add Money
//        Deposit Money
//        Send Money
//        Block Money
//        Release Money
//
//        System should be built keeping in mind not interacting with any third party services like database | cache etc.
//        Code should be in a workable condition at the end and following best practices.



    }

//    public static Map<Integer,Long> findFreqofDuplicated(List<Integer> list){
////        Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(i->i.getValue()>1).map(Map.Entry::getKey)
////                .filter(i->Collections.frequency(list,i)>1).collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
//
//        return list.stream().filter(i->Collections.frequency(list,i)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//    }


    public static Integer timeTakenToBuy(int[] tickets,int k){
        int timeTaken =0; // first ticket
        int len = tickets.length;
        while(tickets[k]>0) {
            for (int i = 0; i < len; i++) {
                if (tickets[k] == 0) {
                    return timeTaken;
                }
                if (tickets[i] > 0) {
                     timeTaken++;
                    tickets[i]--;
                }


            }
        }
        return timeTaken;
    }

    //        int[] arr = {3, 5, 0, 4, 1, 8};
//        int x = 4; // students
//
//        int[] tickets = {5,1,1,1,1};
//        int k =0;  // 6
//        System.out.print(timeTakenToBuy(tickets,k));
//        List<Integer> list = Arrays.asList(3,1,1,3, 5, 0, 4, 1, 8);
//        // R1 : ticket: 1(rem), tt : 3
//        // R2: ticket : 0, 3 , 6(totaltime)
//        System.out.print(findFreqofDuplicated(list));


//    public static void minChocolatesDiff(int[] arr, int x){
//        int minDiff =Integer.MAX_VALUE;
//        Arrays.sort(arr); // 1,2,4,5,8,10
//        int[] res = new int[x];
//        for(int i=0;i<arr.length;i++){
//            int window = i+x-1;
//           // System.out.println("Window" + window + "  i " + i);
//            if(window>=arr.length){
//                break;
//            }
//            int currentDiff = arr[window]-arr[i];
//            if(currentDiff<minDiff){
//                minDiff = currentDiff;
//                for(int j =i;j<=window;j++){
//                    System.out.print(arr[j] + " ,");
//                }
//            }
//        }
//    }


}
















//        List<Employee> list = new ArrayList<>();
//        List<Employee> list1 = list.stream().map(i->i.getAge()>20).filter(i->(i.getSalary()).Collect(Collectors.toList()))

//        Given a string `s` containing only the characters '(', ')', '{', '}', '[' and ']', how can we determine if the input string is valid?

//        A string is valid if:
//        Each open bracket has a corresponding close bracket of the same type.
//        Brackets are closed in the correct order.
//                Every close bracket matches the most recent open bracket of the same type.
      //  Input : "{{])" - not matched
        //  Input : "{[]}" -  matched



















//        Longest Substring Without Repeating Characters
//        Given a string 'S' of length 'L', return the length of the longest substring without repeating characters.





//        SlidingWindowNaive slidingWindowNaive = new SlidingWindowNaive();
//        int arr[] = {4,1,3,5,1,2,3,2,1,1,5};
////        slidingWindowNaive.maxElementKWindow(arr,3);
//
////        DequeSlidingWindow  dequeSlidingWindow = new DequeSlidingWindow();
////        dequeSlidingWindow.findMaxElementKWindow(arr,3);
//
////        AVLTreeSlidingWindow avlTreeSlidingWindow = new AVLTreeSlidingWindow();
////        avlTreeSlidingWindow.maxElementWindowK(arr,3);
//       // Map<String,Integer> map = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().sorted(Integer::compare).findFirst().;
////        LongestCommonSubstring longestCommonSubstring = new LongestCommonSubstring();
////        System.out.print(longestCommonSubstring.longestSubStrong("Robot","bot"));
//
////        BinarySearch binarySearch = new BinarySearch();
////        int[] arr = {1,3,5,8,9,10,11,12,14};
////        System.out.print(binarySearch.binarySearch(arr,0,arr.length-1,12));
////find the frequency of each character in a string in java 8
//        List<String> list = new ArrayList<>();
//        list.add("test");
//        list.add("demo");
//        list.add("hello");
//        //list.add("test");
//        list.add("hello");
//        //list.add("test");
//
//        String result = list.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
//        System.out.println(result);
//        String str = "harpreet";
//        Map<String,String> map = new HashMap<>();
//        map.put("harpreet","Bangalore");
//        map.put("John","Delhi");
//        map.put("Elie","Mumbai");
//        map.put("Daisy","Bangalore");
//
//

        //Map<String,Long> result = map.entrySet().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().

//
//    }
//
//
//    }



