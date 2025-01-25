import spacy
import matplotlib.pyplot as plt

# Load the spaCy model
nlp = spacy.load("en_core_web_sm")

# Define your text
text = "The HIV-AIDS causation has been questioned by many prominent scientists with the most prominent being Peter Duesberg."

# Process the text with spaCy
doc = nlp(text)

# Extract nouns with nominal functions
nouns_with_nominal_functions = [
    token.text for token in doc if token.pos_ in {"NOUN", "PROPN"} and token.dep_ in {"nsubj", "nsubjpass", "dobj", "pobj", "attr"}
]

# Create a visualization of the original text with highlights
def highlight_text(text, highlights):
    words = text.split()
    colored_text = []
    for word in words:
        # Highlight words found in nouns_with_nominal_functions
        if word.strip(",.") in highlights:
            colored_text.append(f"<span style='color:yellow;'>{word}</span>") # Yellow for highlight
        else:
            colored_text.append(word)
    return " ".join(colored_text)

# Visualize with Matplotlib
highlighted_text = highlight_text(text, nouns_with_nominal_functions)

# Plotting the text with highlighted words
fig, ax = plt.subplots(figsize=(12, 2))
ax.text(0.5, 0.5, highlighted_text, fontsize=14, ha='center', wrap=True)
ax.axis('off')
plt.show()

