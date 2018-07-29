package group4;

import java.util.*;
import group4.Chord;

public class ChordSong {

	private static ArrayList<Chord> songChords;
	
	public ChordSong() {
		songChords = new ArrayList<Chord>();
		
	}
	
	public void add(Chord note) {
		songChords.add(note);
		
	}
	
	public static void play(double duration, double[] frequencies) {
		for (Chord note: songChords) {
			Chord.play(duration, frequencies);
		}
		
	}
	
	public Chord chordAt(int index) {
		if (index < 0 || index >+ songChords.size()) {
			throw new IndexOutOfBoundsException("The index is out of bounds");
		}
	return songChords.get(index);
	}
	
	public String toString() {
		return songChords.toString();
	}
	
	


}
