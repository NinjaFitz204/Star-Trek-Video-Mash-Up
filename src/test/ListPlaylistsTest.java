package test;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import main.ListPlaylistsHandler;
import main.ListVideoSegmentsHandler;
import main.http.ListPlaylistResponse;
import main.http.ListVideoSegmentsResponse;
import main.model.Playlist;
import main.model.VideoSegment;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class ListPlaylistsTest extends LambdaTest {
	
    @Test
    public void testGetList() throws IOException {
    	ListPlaylistsHandler handler = new ListPlaylistsHandler();

    	ListPlaylistResponse resp = handler.handleRequest(null, createContext("list"));
        
        boolean hasPlaylist = false;
        for (Playlist p : resp.list) {
        	if (p.getName().equals("test name")) { hasPlaylist = true; break; }
        }
        assertTrue(hasPlaylist);
        assertEquals(200, resp.statusCode);
    }

}
