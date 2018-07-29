package group2;

import stdlib.*;

import java.lang.Math;



public class Distribution {
	
	public static double computeAverage(double[] totalNumbers) {
		double sum = 0.0;
		for (double number: totalNumbers) {
			sum += number;
		}
		double average = (double) sum / totalNumbers.length;
		return average;
	}

	public static double computeAverage2(double[] storeCalc) {
		double sum = 0.0;
		for (double number: storeCalc) {
			sum += number;
		}
		double average2 = (double) sum / storeCalc.length;
		return average2;
	}
	public static double computeDeviation(double[] totalNumbers) {
		/* I wanted to write out the formulas for practice instead of using Math lib
		After spending 4 hours to complete due to debugging
		I realized it was a VERY foolish choice */
		
		double average = computeAverage(totalNumbers);
		double calcDiff = 0.0;
		double numberMeanDiff = 0.0;
		double diffSquared = 0.0;
		double standardDeviation = 0.0;
		double[] storeCalc = new double[totalNumbers.length];
		for (int i = 0; i < totalNumbers.length; i++) {
			double number = totalNumbers[i];
			numberMeanDiff = number - average;
			diffSquared = numberMeanDiff * numberMeanDiff;
			storeCalc[i] = diffSquared;
			
		}
		double average2 = computeAverage2(storeCalc);
		standardDeviation = Math.sqrt(average2);
		return standardDeviation;
		
		
	}		
	
	public static double computePercent1(double[] totalNumbers) {
		double average = computeAverage(totalNumbers);
		double standardDeviation = computeDeviation(totalNumbers);
		double totalOneStd = 0.0;
		for (double number: totalNumbers) {
			if (number > average & number < (average + standardDeviation)) {
				totalOneStd++;
			} else if (number < average & number > (average - standardDeviation)) {
				totalOneStd++;
			}
		}
		
		double percentage1 = totalOneStd / totalNumbers.length * 100;
		return percentage1;
	}
	
	public static double computePercent2(double[] totalNumbers) {
		double average = computeAverage(totalNumbers);
		double standardDeviation = computeDeviation(totalNumbers);
		double totalOneStd = 0.0;
		for (double number: totalNumbers) {
			if (number > average & number < (average + (2 * standardDeviation))) {
				totalOneStd++;
			} else if (number < average & number > (average - (2 * standardDeviation))) {
				totalOneStd++;
			}
		}
		
		double percentage2 = totalOneStd / totalNumbers.length * 100;
		return percentage2;
	}
	
	public static double computePercent3(double[] totalNumbers) {
		double average = computeAverage(totalNumbers);
		double standardDeviation = computeDeviation(totalNumbers);
		double totalOneStd = 0.0;
		for (double number: totalNumbers) {
			if (number > average & number < (average + (3 * standardDeviation))) {
				totalOneStd++;
			} else if (number < average & number > (average - (3 * standardDeviation))) {
				totalOneStd++;
			}
		}
		
		double percentage1 = totalOneStd / totalNumbers.length * 100;
		return percentage1;
	}

	public static void main(String[] args) {

		StdIn.fromFile("data/normaldistribution.txt");
		double[] values = StdIn.readAllDoubles();
		
		double average = computeAverage(values);
		double standardDeviation = computeDeviation(values);
		double percentage1 = computePercent1(values);
		double percentage2 = computePercent2(values);
		double percentage3 = computePercent3(values);
		
		StdOut.println("The average is " + average);
		StdOut.println("The standard deviation is " + standardDeviation);
		StdOut.println("Percentage of values 1 SD away from mean: " + percentage1);
		StdOut.println("Percentage of values 2 SD away from mean: " + percentage2);
		StdOut.println("Percentage of values 3 SD away from mean: " + percentage3);
	}

}
