package main.model;

public class VideoSegment {

	String title;
	String character;
	String url;
	Boolean remoteAvaliability;
	
	public VideoSegment(String title, String character, String url) {
		this.title = title;
		this.character = character;
		this.url = url;
		this.remoteAvaliability = true;
		
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getCharacter() {
		return this.character;
	}
	
	public String getURL() {
		return this.url;
	}
	
	// toggles remote availability of videos
	public void setAvaliability() {
		if(this.remoteAvaliability = true) {
			this.remoteAvaliability = false;
		}
		else {
			this.remoteAvaliability = true;
		}
	}
}
