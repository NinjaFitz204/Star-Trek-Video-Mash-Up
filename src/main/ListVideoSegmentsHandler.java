package main;

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
 
}
