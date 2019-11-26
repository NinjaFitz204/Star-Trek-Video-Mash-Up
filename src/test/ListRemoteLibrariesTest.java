package test;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import main.ListRemoteLibraryHandler;
import main.http.ListRemoteLibrariesResponse;
import main.model.RemoteLib;

/**
 * A simple test harness for locally invoking your Lambda function handler.
 */
public class ListRemoteLibrariesTest extends LambdaTest {
	
    @Test
    public void testGetList() throws IOException {
    	ListRemoteLibraryHandler handler = new ListRemoteLibraryHandler();

    	ListRemoteLibrariesResponse resp = handler.handleRequest(null, createContext("list"));
        
        boolean hasLib = false;
        for (RemoteLib rl : resp.list) {
        	if (rl.getName().equals("remote lib name")) { hasLib = true; break; }
        }
        assertTrue(hasLib);
        assertEquals(200, resp.statusCode);
    }

}
