package mk.iwec.queueExample;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {

	public static void main(String[] args) {
	
		Queue<String> queue = new LinkedList<>();
		queue.add("Banana");
		queue.add("Mango");
		queue.add("Apple");
		
		System.out.println(queue);
		
		String head = queue.remove();
		System.out.println(head);
		
		System.out.println(queue);
		
		queue.add("Strawberry");
		String peek = queue.peek();
		System.out.println("Peek  " +peek);
		
		System.out.println(queue);
	}

}
