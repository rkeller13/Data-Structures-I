package group4;
import stdlib.StdAudio;
import week5examples.Note;

public class Chord {
	
	private double duration;
	private double frequency1;
	private double frequency2;
	private double frequency3;
	private double[] frequencies;

	public Chord (double duration, double frequency1, double frequency2, double frequency3) {
		this.duration = duration;
		this.frequency1 = frequency1;
		this.frequency2 = frequency2;
		this.frequency3 = frequency3;
	}
	
	public Note[] notes() {
		throw new IllegalArgumentException("A frequency and duration must be specified for a Note object.");

	}
	
	public static void play(double duration, double[] frequencies) {
		final int sliceCount = (int) (StdAudio.SAMPLE_RATE * duration);
		final double[] slices = new double[sliceCount+1];
		for (int i = 0; i <= sliceCount; i++) {
			for (double frequency: frequencies) {
				slices[i] += Math.sin(2 * Math.PI * i * frequency / StdAudio.SAMPLE_RATE);
			}
			slices[i] /= frequencies.length;
		}
		StdAudio.play(slices);
	}
	
	public String toString() {
		return String.format("%.2f Hz for %.3f s", this.frequencies, this.duration);
	}
	
	public int hashCode() {
		return Double.hashCode(this.frequency1) + 31 * Double.hashCode(this.duration);

	}
	
	public boolean equals(Object that) {
		if (this == that) return true;
		if (!(that instanceof Chord)) return false;
		Chord thatChord = (Chord) that;
		return this.frequency1 == thatChord.frequency1 && this.frequency2 == thatChord.frequency2 && this.frequency3 == thatChord.frequency3 &&this.duration == thatChord.duration;	
		}
	
	public int compareTo(Chord that) {
		if (this.frequency1 < that.frequency1) return -1;
		if (this.frequency1 > that.frequency1) return 1;
		if (this.frequency2 < that.frequency2) return -1;
		if (this.frequency2 > that.frequency2) return 1;
		if (this.frequency3 < that.frequency3) return -1;
		if (this.frequency3 > that.frequency3) return 1;
		if (this.duration < that.duration) return -1;
		if (this.duration > that.duration) return 1;
		return 0;
	}
	
	

}
