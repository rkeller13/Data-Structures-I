package group3;
import stdlib.*;
import java.util.Arrays;

public class LetterFrequencies {

	public static void main(String[] args) {
		StdOut.print("Please enter the pathname or URL of the book file: ");
		String textSource = StdIn.readLine();
		final In in = new In(textSource);
		final String bookText = in.readAll();
		char[] charArray = bookText.toCharArray();
        if (!in.exists ()) {
        	StdOut.println("Unable to open the text source " + textSource);
            System.exit (1);
        }
		
		int counter;
		int[] frequency = new int [26];
		
        for (int i = 0; i < charArray.length; i++) {
    			char c = charArray[i];
    			counter = (c - 97);
    			if ((counter >= 0) && (counter < 26)) {
    				frequency[counter]++;
    			}

    }
        for (int j = 0; j < frequency.length; j++) {
    			System.out.printf("%c %,15d %n", (j + 97), frequency[j]);		
    }
	}
	

}
