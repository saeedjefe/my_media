package Judo_ontology;

public abstract class UkemiWaza {

    private final String japaneseName;
    private final String description;

    protected UkemiWaza(String japaneseName, String description) {
        this.japaneseName = japaneseName;
        this.description = description;
    }

    public String getJapaneseName() {
        return japaneseName;
    }

    public String getDescription() {
        return description;
    }
}

