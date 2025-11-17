package Judo_ontology;

public abstract class JudoKata {

    private final String japaneseName;
    private final String translation;

    protected JudoKata(String japaneseName, String translation) {
        this.japaneseName = japaneseName;
        this.translation = translation;
    }

    public String getJapaneseName() {
        return japaneseName;
    }

    public String getTranslation() {
        return translation;
    }
}
