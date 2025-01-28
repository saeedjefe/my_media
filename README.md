# 2025_python

1-Opening a file.text in python shell and storing it inside a variable:

with open("file.txt", "r") as file:
	passage = file.read();

2- Now that the text file has been stored in a python variable, we should find out what type the varible is, as
python is not a strongly-typed language. 

in: type(passage)
out: str

3- With the passage being string, we may start manipulating the text using the python built-in functions specified for the string type. 

*replace()
In case of the use of '&' instead of 'and', for example, text manipulation process may be hindered. To avoid 
such problems, 'replace()' method can work miracles. 

r_passage = passage.replace('&', 'and')

*lower()
it is a good idea to convert all the passage into lower case for more straight forward parts of speech tagging and
syntactic analysis. 

rl_passage = r_passage.lower()

Now, it is time to use spacy library.

1-importing the package
import spacy

2-load a saved pretrained model
nlp = spacy.load("en_core_web_sm")
*passing the modified passage as an argument to spacy


3-pass the modified passage as an argment to it 
doc = nlp(rl_passage)

Thankfully, spacy identify newline characters(/n), with the doc variable showing the passage with organized 
paragraphing. 

4- breaking down the pasasge into small pieces of puzzle called tokenization. 
tokens = [token.text for token in doc]

5- identiying each piece of puzzle separately called parts of speech tagging.

determiners = [token.text for token in doc if token.pos_ in 'DET']
numbers = [token.text for token in doc if token.pos_ in 'NUM']
adjectives = [token.text for token in doc if token.pos_ in 'ADJ']
nouns = [token.text for token in doc if token.pos_ in 'NOUN']
pronouns = [token.text for token in doc if token.pos_ in 'PRON' ]
verbs = [token.text for token in doc if token.pos_ in 'VERB']
prepositions = [token.text for token in doc if token.pos_ in 'ADP']
adverbs = [token.text for token in doc if token.pos_ in 'ADV']
coordinating_conjunctions = [ token.text for token in doc if token.pos_ in 'CCONJ']
subordinating_conjunctions = [ token.text for token in doc if token.pos_ in 'SCON']


6- highlighting the passage

 

# Assign colors to token.pos_ (coarse-grained POS tags)
pos_colors = {
    "NOUN": "green",
    "VERB": "blue",
    "ADJ": "cyan",
    "ADV": "magenta",
    "PRON": "yellow",
    "DET": "red",
    "ADP": "purple",
    "CCONJ": "orange",
    "SCONJ": "pink",
    "NUM": "lightblue",
    "PART": "lightgreen",
    "INTJ": "teal",
    "PUNCT": "gray",
    "SYM": "lightgray",
    "X": "white",
}

# Assign colors to token.tag_ (fine-grained POS tags)
tag_colors = {
    "NN": "green",    # Singular noun
    "NNS": "lightgreen",  # Plural noun
    "NNP": "darkgreen",   # Proper singular noun
    "NNPS": "lime",       # Proper plural noun
    "VB": "blue",    # Base form of a verb
    "VBD": "darkblue",  # Past tense
    "VBG": "lightblue", # Gerund or present participle
    "VBN": "teal",      # Past participle
    "VBP": "purple",    # Non-3rd person singular present
    "VBZ": "darkpurple", # 3rd person singular present
    "JJ": "cyan",     # Adjective
    "JJR": "lightcyan", # Comparative adjective
    "JJS": "darkcyan",  # Superlative adjective
    "RB": "magenta",    # Adverb
    "RBR": "lightmagenta", # Comparative adverb
    "RBS": "darkmagenta",  # Superlative adverb
    "DT": "red",      # Determiner
    "IN": "orange",   # Preposition or subordinating conjunction
    "CC": "pink",     # Coordinating conjunction
    "PRP": "yellow",  # Personal pronoun
    "PRP$": "darkyellow", # Possessive pronoun
    "CD": "lightblue", # Cardinal number
    "EX": "gray",     # Existential there
    "FW": "white",    # Foreign word
    "LS": "lightgray", # List item marker
    "MD": "cyan",     # Modal
    "PDT": "red",     # Predeterminer
    "POS": "darkred", # Possessive ending
    "RP": "purple",   # Particle
    "UH": "teal",     # Interjection
    "SYM": "lightgray", # Symbol
    ".": "gray",      # Sentence-ending punctuation
    ",": "darkgray",  # Comma
    ":": "darkgray",  # Colon
    "(": "lightgray", # Left parenthesis
    ")": "lightgray", # Right parenthesis
}

# Assign colors to token.dep_ (dependency relations)
dep_colors = {
    "nsubj": "green",        # Nominal subject
    "dobj": "blue",          # Direct object
    "iobj": "cyan",          # Indirect object
    "pobj": "purple",        # Object of preposition
    "attr": "orange",        # Attribute
    "ROOT": "yellow",        # Root of the sentence
    "advmod": "magenta",     # Adverbial modifier
    "amod": "red",           # Adjectival modifier
    "prep": "lightblue",     # Prepositional modifier
    "appos": "darkgreen",    # Appositional modifier
    "conj": "pink",          # Conjunction
    "cc": "teal",            # Coordinating conjunction
    "det": "darkred",        # Determiner
    "punct": "gray",         # Punctuation
    "compound": "lightgray", # Compound word
    "nummod": "lime",        # Numeric modifier
    "xcomp": "darkcyan",     # Open clausal complement
}

# Example: Applying colors
import spacy
from rich import print

nlp = spacy.load("en_core_web_sm")
doc = nlp("The quick brown fox jumps over the lazy dog.")

for token in doc:
    # Get the colors for POS, tag, and dependency relation
    pos_color = pos_colors.get(token.pos_, "white")
    tag_color = tag_colors.get(token.tag_, "white")
    dep_color = dep_colors.get(token.dep_, "white")
    
    # Print the token with corresponding colors
    print(
        f"[{pos_color}]{token.text}[/{pos_color}] "
        f"(POS: [{pos_color}]{token.pos_}[/{pos_color}], "
        f"Tag: [{tag_color}]{token.tag_}[/{tag_color}], "
        f"Dep: [{dep_color}]{token.dep_}[/{dep_color}])"
    )

