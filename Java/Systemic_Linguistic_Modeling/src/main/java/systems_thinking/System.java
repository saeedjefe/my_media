package systems_thinking;

/*this abstract class is a blueprint for the systems to be created in the future.
So far, we have identified several elements for systems thinking, each of which
should be declared as parameters inside the constructor of the subclasses of the
class system.
 */
public abstract class System implements  Behaviors, Processes, Modifiers, Dependencies, States{

    Entities entities;
    Inputs inputs;
    Outputs outputs;
    Goals goals;
    Repositories repositories;
    Attributes attributes;


    public System(){

    }

    public System(Entities entities, Inputs inputs, Outputs outputs, Goals goals, Repositories repositories, Attributes attributes, Boundaries boundaries) {

            this.entities = entities;
            this.inputs = inputs;
            this.outputs = outputs;
            this.goals = goals;
            this.repositories = repositories;
            this.attributes = attributes;

    }



    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public Inputs getInputs() {
        return inputs;
    }

    public void setInputs(Inputs inputs) {
        this.inputs = inputs;
    }

    public Outputs getOutputs() {
        return outputs;
    }

    public void setOutputs(Outputs outputs) {
        this.outputs = outputs;
    }

    public Goals getGoals() {
        return goals;
    }

    public void setGoals(Goals goals) {
        this.goals = goals;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Repositories getRepositories() {
        return repositories;
    }

    public void setRepositories(Repositories repositories) {
        this.repositories = repositories;
    }


// Optional: Provide getters

    // etc...
}
