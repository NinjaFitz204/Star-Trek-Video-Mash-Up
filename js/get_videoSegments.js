videosURL = value;

let request = new XMLHttpRequest();
request.open('GET', videosURL, true);
  request.onload = function () {
  // Convert JSON data to an object
  let videos = JSON.parse(this.response);
  let output = '';
  for (var i = 0; i < videos.length; i++) {    
      output+= '<input type="checkbox" name=' + videos[i].id + '>' + '<br>' + videos[i].name + '<br>' + videos[i].character
    output += '<li>' +  + ' is ' +  + ' years old.'; '</li>'
  }
  document.getElementById('videos').innerHTML = output;
}
request.send();