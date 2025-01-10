#!/bin/bash
#define file variables
HTML_FILE="main.html"
TEXT_FILE="main.txt"
OUT_FILE="output.html"

#check whether files exist
if [[ -f "$HTML_FILE" && -f "$TEXT_FILE" ]]; then
	echo "both file have been found"
else
	echo "files not found"
	exit 1
fi


#separate files by lines and store them inside variables
HEADER_CONTENT=$(sed -n '1p' "$TEXT_FILE")
BODY_CONTENT_MAIN_PARAGRAPH=$(sed -n '2p' "$TEXT_FILE")
FOOTER_CONTENT=$(sed -n '3p' "$TEXT_FILE")


#read the variables 
echo "$HEADER_CONTENT"
echo "$BODY_CONTENT_MAIN_PARAGRAPH"
echo "$FOOTER_CONTENT"

#inject them into html tas
sed -i "/<head>/a <title>$HEADER_CONTENT</title>" 
    "$HTML_FILE" > "output.html"

#read the html file 




#insert the lines into specific tags and elements


