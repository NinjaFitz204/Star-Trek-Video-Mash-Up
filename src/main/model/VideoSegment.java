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
}
