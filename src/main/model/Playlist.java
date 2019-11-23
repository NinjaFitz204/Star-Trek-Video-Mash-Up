package main.model;

import java.util.ArrayList;

public class Playlist {

	String name;
	ArrayList<VideoSegment> playlistVideos;
	int numofVideos;
	
	public Playlist(String name) {
		this.name = name;
		// add this
		//this.playlistVideos =
		this.numofVideos = 0;
	}
	
	public void appendEntry(VideoSegment vs) {
		/// add Body of method
	}
	
	public void removeEntry(VideoSegment vs) {
		/// add Body of method
	}
}
