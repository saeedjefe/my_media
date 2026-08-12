df_0_path="./content/ielts/flowcharts/01-Family-Vocabulary for IELTS.pdf"
pdf_1_path="./assets/images/Iceman-Focus on vocabulary 2-v01.pdf"

if [[  -f "$pdf_1_path" ]]; then
	echo "pdf files have been found"
	cd assets || exit 1
        pwd
	mkdir -p pdfs
	mv "../$pdf_1_path" pdfs
else 
	echo "pdf files have not been found"
fi

