package main;

import java.util.List;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import main.DB.VideoSegmentsDAO;
import main.http.ListRemoteLibrariesRequest;
import main.http.ListRemoteLibrariesResponse;
import main.model.VideoSegment;


public class ListRemoteLibraryHandler implements RequestHandler<ListRemoteLibrariesRequest,ListRemoteLibrariesResponse>{

	@Override
	public ListRemoteLibrariesResponse handleRequest(ListRemoteLibrariesRequest arg0, Context arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
