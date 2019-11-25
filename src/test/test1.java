package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.DB.VideoSegmentsDAO;
import main.model.VideoSegment;

class test1 {

	@Test
	void test() {
		VideoSegmentsDAO test = new VideoSegmentsDAO();
		List<VideoSegment> list;
		try {
			list = test.getAllVideoSegments();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
