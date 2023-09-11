//class header
public class Song {
	//attributes
	private String title;
	private String artist;
	//constructor
	//default
	public Song() {
		title = "";
		artist = "";
	}
	
	public Song(String initTitle, String initArtist) {
		title = initTitle;
		artist = initArtist;
	}
	
	//methods
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public static void main(String[] arg) {
		 
		
		
		
	}
	
}
