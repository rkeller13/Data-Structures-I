package group2;

import java.util.Arrays;

import stdlib.In;
import stdlib.StdIn;
import stdlib.StdOut;

public class WordStatistics {

	public static int computeAvgWordLen(int[] words) {
		int sum = 0;
		for (int word:words) {
			sum += word;
		} 
		int average = sum / words.length;
		return average;
	}
	
	public static int computeMedWordLen(int[] words) {
		Arrays.sort(words);
		int middle = words.length / 2;
		int evenCalcMid = ((words.length/2) +1);
		int median = 0;
		for (int word:words) {
			if (words.length % 2 == 0) {
				 median = ((words[evenCalcMid] + words[middle]) / 2);
			}
			else {
				 median = words[middle];
			}
		}
		return median;
	}
	
	
	public static void main(String[] args) {
		StdOut.print("Please enter the pathname or URL of the book file: ");
		String textSource = StdIn.readLine();
		
        final In in = new In(textSource);
        if (!in.exists ()) {
        	StdOut.println("Unable to open the text source " + textSource);
            System.exit (1);
        }

        final String bookText = in.readAll();
        String[] bookWords = bookText.split("\\s+");
        int[] wordLength = new int[bookWords.length];
        for (int i = 0; i < bookWords.length; i++) {
        		wordLength[i] = bookWords[i].length();
        }
        
       double avgWordLength = computeAvgWordLen(wordLength);
       int medWordLength = computeMedWordLen(wordLength);
        
        StdOut.println("The average word length is " + avgWordLength);
        StdOut.println("The median word length is " + medWordLength);
       
        
	}

}
