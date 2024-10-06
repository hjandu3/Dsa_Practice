import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

    // List of queue
    // Get the last element then add
    // Recursive method call before adding the element, then add the element,
    // first the inner call will be called then outer.. hence queue will get reversed
    public Queue<Integer> reverseQueue(Queue<Integer> queue){
        if(queue.size()==0){
            return queue;
        }

        Queue<Integer> integerQueue = new LinkedList<Integer>();
        int element = queue.poll();
            reverseQueue(queue);


        queue.add(element);
        return queue;
    }
}
