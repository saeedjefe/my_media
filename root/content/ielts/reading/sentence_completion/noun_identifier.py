import spacy

with open("22_modifed.txt", "r") as file:
  unrefind_passage = file.read();
split_passage = unrefined_passage.split()
modified_passage = " ".join(split_passage);

cleaned_list = []
for word in split_passage:
    cleaned_word = word.strip('&')
    cleaned_list.append(cleaned_word);
cleaned_passage = " ".join(cleaned_list);


nlp = spacy.load("en_core_web_sm")
doc = nlp(cleaned_passage);
nouns_with_nominal_functions = [ token.text for token in doc if token.pos_  in {"NOUN", "PROPN"} and token.dep_ in {"nsubj","nsubjpass","dobj","iobj","pobj","attr", "poss"}]
for word in split_passage:
    if word in nouns_with_nominal_functions:
        highlighted_words.append(f"<span style='color:green'>{word}</span>");
    else:
        highlighted_words.append(word);
final_passage = " ".join(highlighted_words);

