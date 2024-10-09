package mk.iwec.ListExamples;
import java.util.Collections;
import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack <>();
		
		stack.push(3);
		stack.push(8);
		stack.push(10);
		stack.push(2);
		
		System.out.println(stack);
		System.out.println("Element at the top ");
		System.out.println(stack.peek());
		
		stack.pop();
		System.out.println("After pop " +stack);
		stack.pop();
		System.out.println("fter second pop " +stack);
		System.out.println("Position of 3 is " + stack.search(3));
		
		Collections.reverse(stack);
		System.out.println(stack);
	}
	

}
