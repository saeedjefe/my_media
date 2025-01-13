#!/bin/bash


#path to the html file
HTML_TEMPLATE="/home/the-polymath/2024/tehranian_polymath/html_css_javascript/assets/html/template.html"
HTML_MAIN="/home/the-polymath/2024/tehranian_polymath/html_css_javascript/root/main.html"
HTML_IELTS="/home/the-polymath/2024/tehranian_polymath/html_css_javascript/root/content/ielts/ielts.html"
ROOT_ADDRESS="/home/the-polymath/2024/tehranian_polymath/html_css_javascript/root"
CSS_TEMPLATE="/home/the-polymath/2024/tehranian_polymath/html_css_javascript/assets/css/styles.css"
SCRIPT_JS="/home/the-polymath/2024/tehranian_polymath/html_css_javascript/assets/js/dynamics.js"
#make sure the files exist
if [[ -f "$HTML_TEMPLATE" && -d "$ROOT_ADDRESS" && -f "$CSS_TEMPLATE" ]]; then
	echo "the html file exists: '$HTML_TEMPLATE' and so does the rootpath'$ROOT_ADDRESS' so does the css'$CSS_TEMPLATE'" 
else 
	echo "the hmtl file has not been found"
	exit 1
fi

CSS_LINK="<link rel=\"stylesheet\" href=\"$CSS_TEMPLATE\">"
SCRIPT="<script src=\"$SCRIPT_JS\">     </script>"

#look through all the html file in the sub directories
find "$ROOT_ADDRESS" -type f -name "*.html" ! -path "$HTML_TEMPLATE"  ! -path "$HTML_MAIN" ! -path "$HTML_IELTS" | while read -r FILE; do
#backup the file
	cp "$FILE" "$FILE.bak"
 
#concatenate the template and the original file, and overwrite the file
	cp "$HTML_TEMPLATE" "$FILE"
	echo "the template has been placed in all the html files successfully: '$FILE'"

	sed -i "/<!-- CSS Dependencies -->/a $CSS_LINK" "$FILE"
	echo "the css style has been injected"
	sed -i "/<!-- JavaScript Dependencies -->/a $SCRIPT" "$FILE"
	echo "the javascirpt scr has been injected"
		

#inject the css line 
done


: << 'COMMENT'
./root/content/ielts/ielts.html
./root/content/ielts/writing/writing.html
./root/content/ielts/writing/task_1/task_1.html
./root/content/ielts/writing/task_1/graphs/graphs.html
./root/content/ielts/writing/task_1/graphs/strategies/task_1.html
./root/main.html
./root/assets/html/template.html
    ESCAPED_CSS_LINK=$(printf '%s' "$CSS_LINK" | sed 's/[&/\]/\\&/g')

    # Insert the CSS link tag after the <head> tag
    sed -i.bak "/<head>/a $ESCAPED_CSS_LINK" "$FILE"

    # Check if the <head> tag was modified
    if ! diff "$FILE" "$FILE.bak" >/dev/null; then
        echo "Injected CSS into: $FILE"
    else
        echo "No changes made to: $FILE (likely no <head> tag present)"
    fi
done
COMMENT
