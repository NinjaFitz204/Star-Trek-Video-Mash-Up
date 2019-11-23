package main;

import java.util.List;

import main.DB.PlaylistsDAO;
import main.http.ListPlaylistRequest;
import main.http.ListPlaylistResponse;
import main.model.Playlist;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.runtime.*;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ListObjectsV2Request;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.S3ObjectSummary;


public class ListPlaylistsHandler implements RequestHandler<ListPlaylistRequest,ListPlaylistResponse>{

	public LambdaLogger logger;

	List<Playlist> getPlaylists() throws Exception {
		logger.log("in getPlaylists");
		PlaylistsDAO dao = new PlaylistsDAO();
		
		return dao.getAllPlaylists();
	}

	@Override
	public ListPlaylistResponse handleRequest(ListPlaylistRequest arg0, Context arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
