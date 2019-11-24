package main.DB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.wpi.cs.heineman.calculator.db.DatabaseUtil;
import edu.wpi.cs.heineman.calculator.model.Constant;
import main.model.Playlist;
import main.model.VideoSegment;

public class PlaylistsDAO {

	java.sql.Connection conn;

    public PlaylistsDAO() {
    	try  {
    		conn = DatabaseUtil.connect();
    	} catch (Exception e) {
    		conn = null;
    	}
    }
	
	public List<Playlist> listAllPlaylists() throws Exception {
        
        try {
        	List<Playlist> playlists = new ArrayList<Playlist>();
        	
            PreparedStatement ps = conn.prepareStatement("SELECT distinct playlistname FROM playlists");
            ResultSet resultSet = ps.executeQuery();
            
            while (resultSet.next()) {
            	Playlist p = generatePlaylist(resultSet);
                playlists.add(p);
            }
            resultSet.close();
            ps.close();
            
            for(Playlist playlist: playlists) {
            	ps = conn.prepareStatement("SELECT * FROM playlists where playlistname = '" + playlist.getName() + "'");
            	resultSet = ps.executeQuery();
            	
            	while (resultSet.next()) {
            		VideoSegment vs = generateVideoSegment(resultSet);
            		playlist.add(vs);
            	}
            	resultSet.close();
                ps.close();
            }
            return playlists;

        } catch (Exception e) {
        	e.printStackTrace();
            throw new Exception("Failed in getting playlists: " + e.getMessage());
        }
	}

	private VideoSegment generateVideoSegment(ResultSet resultSet) throws Exception {
		String URL = resultSet.getString("videoURL");
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM Library where URL = '" + URL + "'");
        ResultSet result = ps.executeQuery();
        String title;
        String character;
        
        while (resultSet.next()) {
        	title = result.getString("title");
        	character = result.getString("character");
        }
		
		return new VideoSegment(title,character,URL);
	}

	private Playlist generatePlaylist(ResultSet resultSet) {
		// TODO Auto-generated method stub
		return new Playlist(resultSet.getString("playlistname"),new ArrayList<VideoSegments>());
	}
	
	public Playlist getPlaylist(String playlistName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<VideoSegment> getPlaylistVideoSegments(String playlistName) {
		// TODO Auto-generated method stub
		return null;
	}


}
