var express = require('express');

//var morgan = require('morgan');
//var path = require('path');
var path = require('path');
var app = express();

app.set('port',9090 );

app.get('/', function (req, res) {
  //res.render('index',{title : 'Hello World' });
  res.sendFile(path.join(__dirname, 'pages', 'index.html'));
});

app.get('/style.css', function (req, res) {
  res.sendFile(path.join(__dirname, 'pages', 'style.css'));
  });
  app.get('/styl.css', function (req, res) {
  res.sendFile(path.join(__dirname, 'pages', 'styl.css'));
  });
  app.get('/main.js', function (req, res) {
  res.sendFile(path.join(__dirname, 'pages', 'main.js'));
  });
  app.get('/png3.png', function (req, res) {
    res.sendFile(path.join(__dirname, 'Images', 'png3.png'));
    });

  app.get('/gradient.css', function (req, res) {
    res.sendFile(path.join(__dirname, 'pages', 'gradient.css'));
    });
  app.get('/gradient.js', function (req, res) {
    res.sendFile(path.join(__dirname, 'pages', 'gradient.js'));
    });
 var counter = 0; 
app.get('/counter', function (req, res) {
    counter+=1;
    res.send(counter.toString());
    });


	


  
app.listen(app.get('port'), function(){
	console.log('Express Started');
});
