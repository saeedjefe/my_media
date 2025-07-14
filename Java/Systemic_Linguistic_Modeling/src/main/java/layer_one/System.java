package layer_one;

public abstract class System {

    protected Entities entities;
    protected Boundaries boundaries;
    protected Goals goals;
    protected Repositories repositories;
    public System(Entities entities, Boundaries boundaries, Goals goals, Repositories repositories) {
        this.entities = entities;
        this.boundaries = boundaries;
        this.goals = goals;
        this.repositories = repositories;
    }




    // Optional: Provide getters

    // etc...
}
