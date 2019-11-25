function refreshVideoSegments() {
	let request = new XMLHttpRequest();
	request.open('GET', videos_url, true);
	request.send();
	
	console.log("sent");
	
	request.onload = function() {
		if (request.readyState == XMLHttpRequest.DONE) {
			console.log ("request:" + request.responseText);
			processVideoListResponse(request.responseText);
		} else {
			processVideoListResponse("N/A");
		}
	};
}

function processVideoListResponse(result) {
	console.log("res:" + result);
	var js = JSON.parse(result);
	var videoList = document.getElementById('videoSegmentList');

	var output = '';
	output +='<ul style="list-style-type:none;">';
	for (var i = 0; i < js.listOfSegments.length; i++) {
		var constantJson = js.listOfSegments[i];
		console.log(constantJson);

		var ctitle = constantJson["title"];
		var ccharacter = constantJson["character"];
		var curl = constantJson["url"];
		output += '<li><input type="checkbox" name="' + curl + '"><br> Line:' + ctitle + '<br> Character: ' + ccharacter + '</li>';
	}
	output += '</ul>';
	videoList.innerHTML = output;
}