package SlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AVLTreeSlidingWindow {

    public void maxElementWindowK(int[] arr, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        List<Integer> resultList = new ArrayList<>();
        int i =0;
        for(;i<k;i++){
            priorityQueue.add(arr[i]);
        }
        resultList.add(priorityQueue.peek());
        priorityQueue.remove(arr[0]);
        for(;i<arr.length;i++){
            priorityQueue.add(arr[i]);
            priorityQueue.remove(arr[i-k+1]);
            resultList.add(priorityQueue.peek());
        }

        for(Integer ele : resultList){
            System.out.print(ele + " ");
        }

    }
}
