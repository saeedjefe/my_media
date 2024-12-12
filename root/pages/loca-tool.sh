#!/bin/bash 

TEMPLATE_PATH="/home/the-polymath/2024/tehranian_polymath/html_css_javascript/root/assets/html/template.html"

if [ ! -f "$TEMPLATE_PATH"]; then
	echo "template html file doesn't exist at $TEMPLATE_PATH"
exit 1
fi

find . -type f -name "*.html" | while read -r file; do
	cp "$TEMPLATE_PATH" "$file"
	echo "Overwritten by $file"	
done


