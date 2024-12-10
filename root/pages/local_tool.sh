#!/bin/bash

# Path to the new CSS file
NEW_CSS_PATH="/home/the-polymath/2024/tehranian_polymath/html_css_javascript/root/assets/css/styles.css"

# Find all .html files in the current directory and subdirectories
find . -type f -name "*.html" | while read -r file; do
  # Delete the line containing <link rely=stylesheet
  sed -i '/<link rely=stylesheet/d' "$file"

  # Insert the new CSS dependency after the <!-- CSS Dependencies --> comment
  sed -i "/<!-- CSS Dependencies -->/a \ \ <link rel=\"stylesheet\" href=\"$NEW_CSS_PATH\">" "$file"

  # Optional: Output the updated file for confirmation
  echo "Updated: $file"
done

