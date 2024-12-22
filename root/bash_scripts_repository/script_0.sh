#!/bin/bash

HTML_PATH=./pages/flow_charts.html 
TEMPLATE_PATH=./assets/html/template.html

if [[ -f "$HTML_PATH" && -f "$TEMPLATE_PATH" ]]; then
	echo "all the tree files exit"
	sed -i 'r' "$HTML_PATH" "$TEMPLATE_PATH"
else
	echo "this is an error"
fi

sed -i '/<!-- Insert Content Here -->/r '"$HTML_PATH" "$TEMPLATE_PATH"

