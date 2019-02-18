package lec12.ex03;

public interface Song {

	public enum Genre {NONE, POP, RAP, JAZZ, INDIE, CLASSICAL};

	String getName();
	String getArtist();
	Genre getGenre();
}
