package systemic_linguistic_modeling;

public abstract class System implements Processes,
        Behaviors,
        States,
        Modifiers,
        Dependencies {

    protected Entities entities;
    protected Inputs inputs;
    protected Outputs outputs;
    protected Boundaries boundaries;
    protected Goals goals;
    protected Repositories repositories;
    public System(Entities entities, Inputs inputs) {
        this.entities = entities;
        this.inputs = inputs;
    }


    // Optional: Provide getters

    // etc...
}
