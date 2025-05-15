package systemic_linguistic_modeling;

public abstract class System implements Processes, Behaviors {

    protected final Goals goals;
    protected final Entities entities;
    protected final Inputs inputs;
    protected final Outputs outputs;
    protected final Repositories repositories;
    protected final Boundaries boundaries;
    protected final Modifiers modifiers;
    protected final Dependencies dependencies;

    public System(
            Goals goals,
            Entities entities,
            Inputs inputs,
            Outputs outputs,
            Repositories repositories,
            Boundaries boundaries,
            Modifiers modifiers,
            Dependencies dependencies
    ) {
        this.goals = goals;
        this.entities = entities;
        this.inputs = inputs;
        this.outputs = outputs;
        this.repositories = repositories;
        this.boundaries = boundaries;
        this.modifiers = modifiers;
        this.dependencies = dependencies;
    }

    // Optional: Provide getters

    // etc...
}
