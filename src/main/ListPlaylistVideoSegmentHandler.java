package main;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import main.http.ListPlaylistVideoSegmentsRequest;
import main.http.ListPlaylistVideoSegmentsResponse;


public class ListPlaylistVideoSegmentHandler implements RequestHandler<ListPlaylistVideoSegmentsRequest,ListPlaylistVideoSegmentsResponse>{

	@Override
	public ListPlaylistVideoSegmentsResponse handleRequest(ListPlaylistVideoSegmentsRequest arg0, Context arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
