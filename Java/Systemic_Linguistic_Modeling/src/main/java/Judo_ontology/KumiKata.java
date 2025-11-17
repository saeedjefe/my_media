package Judo_ontology;

public abstract class KumiKata {

    private final String japaneseName;
    private final String description;

    protected KumiKata(String japaneseName, String description) {
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

