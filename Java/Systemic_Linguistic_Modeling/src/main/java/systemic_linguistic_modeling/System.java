package systemic_linguistic_modeling;

public abstract class System implements Processes, Behaviors {

    protected Entities entities;

    public System(Entities entities) {
        this.entities = entities;
    }

    // Optional: Provide getters

    // etc...
}
