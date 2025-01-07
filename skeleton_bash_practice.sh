#!/bin/bash

TEXT="article.txt"
SKELETON_HTML="skeleton_practice.html"
THE_TITLE=$(sed -n "1p" "$TEXT")
THE_SECTION_ONE=$(sed -n "3p" "$TEXT")
THE_SECTION_TWO=$(sed -n "5p" "$TEXT")
THE_SECTION_THREE=$(sed -n "7p" "$TEXT")

sed -e "/class=\"first\"/c <section class=\"first\"><h1>$THE_SECTION_ONE</h1></section>" \
    -e "/class=\"second\"/c <section class=\"second\"><h1>$THE_SECTION_TWO</h1></section>" \
    -e "/class=\"third\"/c <section class=\"third\"><h1>$THE_SECTION_THREE</h1></section>" \
    "$SKELETON_HTML" > "output.html"


:<< "comment"
echo "$THE_TITLE"
echo "$THE_SECTION_ONE"

s/delimiter-pattern-delimiter-replacement-delimiter/
comment
