package SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class DequeSlidingWindow {

    public void findMaxElementKWindow(int arr[],int k){
        Deque<Integer> deque = new ArrayDeque<>();
        int i=0;
        for(;i<k;i++){
            while((!deque.isEmpty()) && arr[i]>=arr[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        for(;i<arr.length;i++){
            System.out.print(arr[deque.peek()]+ " ");
            // check window size and remove max elements
            while ((!deque.isEmpty()) && deque.peek()<=i-k){
                deque.removeFirst();
            }
            while ((!deque.isEmpty()) && arr[i]>=arr[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }
        System.out.print(arr[deque.peek()]);

    }

}
