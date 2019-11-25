package test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import main.ListVideoSegmentsHandler;
import main.http.ListVideoSegmentsResponse;
import main.model.VideoSegment;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class ListVideoSegmentsTest extends LambdaTest {
	
    @Test
    public void testGetList() throws IOException {
    	ListVideoSegmentsHandler handler = new ListVideoSegmentsHandler();

    	ListVideoSegmentsResponse resp = handler.handleRequest(null, createContext("list"));
        
        boolean hasVideo = false;
        for (VideoSegment c : resp.list) {
        	if (c.getTitle().equals("It will be our secret")) { hasVideo = true; break; }
        }
        Assert.assertTrue(hasVideo);
        Assert.assertEquals(200, resp.statusCode);
    }

}
