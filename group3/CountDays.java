package group3;
import java.util.Arrays;
import java.util.Comparator;
import stdlib.*;

public class CountDays {
	
	
	public static void main(String[] args) {
		StdOut.print("Please enter a start date: ");
		String firstDate = StdIn.readLine();
		StdOut.print("Please enter an end date: ");
		String secondDate = StdIn.readLine();
		
		Group3Date startDate = new Group3Date(firstDate);
		Group3Date endDate = new Group3Date(secondDate);
		int count = startDate.countDaysUntil(endDate);
		StdOut.println(count);

		

	}

}
