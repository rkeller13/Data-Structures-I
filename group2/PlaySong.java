package group2;

import stdlib.*;

public class PlaySong {

	public static void playTone(double frequency, double duration) {
		final int sliceCount = (int) (StdAudio.SAMPLE_RATE * duration);
		final double[] slices = new double[sliceCount+1];
		for (int i = 0; i <= sliceCount; i++) {
			slices[i] = Math.sin(2 * Math.PI * i * frequency / StdAudio.SAMPLE_RATE);
		}
		StdAudio.play(slices);
	}
	
	public static void main(String[] args) {

		StdIn.fromFile("data/group2song.txt");
		double[] freqValue = StdIn.readAllDoubles();
		for (int i=0; i < freqValue.length; i++) {
			playTone(freqValue[i], .25);
	
			
		}
		
	}

}
