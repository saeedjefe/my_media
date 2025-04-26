package systemic_linguistic_modeling;

public abstract class Elements {


    Entities entities;
    Inputs inputs;
    Outputs outputs;
    Repositories repositories;
    Modifiers modifiers;
    Boundaries boundaries;



    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setInputs(Inputs inputs) {
        this.inputs = inputs;
    }

    public Inputs getInputs() {
        return inputs;
    }

    public void setOutputs(Outputs outputs) {
        this.outputs = outputs;
    }

    public Outputs getOutputs() {
        return outputs;
    }

    public void setModifiers(Modifiers modifiers) {
        this.modifiers = modifiers;
    }

    public Modifiers getModifiers() {
        return modifiers;
    }

    public void setRepositories(Repositories repositories) {
        this.repositories = repositories;
    }

    public Repositories getRepositories() {
        return repositories;
    }

    public void setBoundaries(Boundaries boundaries) {
        this.boundaries = boundaries;
    }

    public Boundaries getBoundaries() {
        return boundaries;
    }
}

