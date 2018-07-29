package group4;
import stdlib.StdAudio;
import group4.Chord;

public class TestChord {


	
	public void main(String[] args) {
		double[] frequencies1 = {261.626, 349.228, 391.995};
		Chord.play(0.5, frequencies1);

		double[] frequencies2 = {440.0, 880.0, 1760.0};
		Chord.play(0.5, frequencies2);
		
		double[] frequencies3 = {329.628, 391.995, 493.883};
		Chord.play(0.5, frequencies3);
		
	}

}
