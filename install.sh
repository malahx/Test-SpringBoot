#!/bin/bash
npm install

if [ ! -d server/src/main/resources/static/css ]
    then
	mkdir server/src/main/resources/static/css
fi
if [ ! -d server/src/main/resources/static/js ]
    then
	mkdir server/src/main/resources/static/js
fi
cp -f node_modules/bootstrap/dist/css/bootstrap.min.css server/src/main/resources/static/css/
cp -f node_modules/bootstrap/dist/css/bootstrap.min.css.map server/src/main/resources/static/css/
cp -f node_modules/bootstrap/dist/js/bootstrap.min.js server/src/main/resources/static/js/
cp -f node_modules/dl-stompjs/lib/stomp.min.js server/src/main/resources/static/js/
cp -f node_modules/jquery/dist/jquery.min.js server/src/main/resources/static/js/
cp -f node_modules/sockjs-client/dist/sockjs.min.js server/src/main/resources/static/js/
cp -f node_modules/sockjs-client/dist/sockjs.min.js.map server/src/main/resources/static/js/

if [ ! -d gui/war/css ]
	then
	mkdir gui/war/css
fi
if [ ! -d gui/war/js ]
	then
	mkdir gui/war/js
fi
cp -f node_modules/bootstrap/dist/css/bootstrap.min.css gui/war/css/
cp -f node_modules/bootstrap/dist/css/bootstrap.min.css.map gui/war/css/
cp -f node_modules/bootstrap/dist/js/bootstrap.min.js gui/war/js/
cp -f node_modules/jquery/dist/jquery.min.js gui/war/js/