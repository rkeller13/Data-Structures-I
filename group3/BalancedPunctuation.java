package group3;
import java.util.NoSuchElementException;

import stdlib.*;
import week4examples.Stack;
/*
 * 	public T pop() {
		if (isEmpty()) throw new NoSuchElementException("Stack underflow");
		T item = first.item;        // save item to return
		first = first.next;            // delete first node
		count--;
		return item;                   // return the saved item
	}
 */
public class BalancedPunctuation {

	public static void main(String[] args) {
		StdOut.print("Please enter a sentence: ");
		String expression = StdIn.readString();
		String[] tokens = expression.split("\\s+");
		Stack<String> punctuation  = new Stack<> ();
		
		while (!StdIn.isEmpty()) {
			String s = StdIn.readString();
			
			for (String token: tokens) {
				
				if (s.equals("(")) punctuation.push(s);
				else if (s.equals(")")) {
					String punc = punctuation.pop();
					if (s!=("(")) throw new RuntimeException("Unbalanced String!");
				}
				
				if (s.equals("[")) punctuation.push(s);
				else if (s.equals("]")) {
					String punc = punctuation.pop();
					if (s!=("[")) throw new RuntimeException("Unbalanced String!");
				}
				
				if (s.equals("{")) punctuation.push(s);
				else if (s.equals("}")) {
					String punc = punctuation.pop();
					if (s!=("{")) throw new RuntimeException("Unbalanced String!");
				}
				
				}
			
			}

		}

	}
		
		
	


