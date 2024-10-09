package mk.iwec.dequeueExamples;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueExamples {

	public static void main(String[] args) {
		
		Deque<String> dequeue = new LinkedList<>();
		
		dequeue.add("Element 1");
		
		dequeue.addFirst("Element 2 head ");
		dequeue.addLast("Element 3 tail ");
		
		dequeue.removeFirst();
		dequeue.removeLast();
		
		System.out.println(dequeue);
	}

}
