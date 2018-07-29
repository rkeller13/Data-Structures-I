package group4;

import java.util.*;
import group4.Chord;
import group4.ChordSong;

//Works, but definitely isn't what the assignment wants the program to look like
public class TestChordSong {

	static double [] songChords;
	public static void main(String[] args) {

		double[] frequencies1 = {27.500, 29.135, 30.868};
		double[] frequencies2 = {55.000, 58.270, 61.735};
		double[] frequencies3 = {110.000, 116.541, 123.471};
		double[] frequencies4 = {220.000, 233.082, 246.942};
		double[] frequencies5 = {440.000, 466.164, 493.883};
		double[] frequencies6 = {880.000, 932.328, 987.767};
		double[] frequencies7 = {1760.000, 1864.655, 1975.533};
		double[] frequencies8 = {3520.000, 3729.310, 3951.06}; 

		
		Chord.play(.25, frequencies1);
		Chord.play(.25, frequencies2);
		Chord.play(.25, frequencies3);
		Chord.play(.25, frequencies4);
		Chord.play(.25, frequencies5);
		Chord.play(.25, frequencies6);
		Chord.play(.25, frequencies7);
		Chord.play(.25, frequencies8);

		
		
	}

}
