package main;

<<<<<<< HEAD
import java.util.List;

import main.DB.PlaylistsDAO;
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

public class ListVideoSegmentsHandler {
 //this is mine
=======
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import main.http.ListPlaylistRequest;
import main.http.ListPlaylistResponse;
import main.http.ListVideoSegmentsRequest;
import main.http.ListVideoSegmentsResponse;

public class ListVideoSegmentsHandler implements RequestHandler<ListVideoSegmentsRequest,ListVideoSegmentsResponse>{

	@Override
	public ListVideoSegmentsResponse handleRequest(ListVideoSegmentsRequest arg0, Context arg1) {
		// TODO Auto-generated method stub
		return null;
	}
 
>>>>>>> refs/heads/Naomi
}
