package ontology.core;

import ontology.behavioral.BehavioralPattern;
import ontology.behavioral.FunctionalBehavior;
import ontology.behavioral.Input;
import ontology.behavioral.Output;
import ontology.motivational.Goal;
import ontology.motivational.Need;
import ontology.motivational.Problem;
import ontology.motivational.Purpose;
import ontology.structural.*;

import java.util.ArrayList;

/*this abstract class is a blueprint for the systems to be created in the future.
So far, we have identified several elements for systems thinking, each of which
should be declared as parameters inside the constructor of the subclasses of the
class system.
 */
import java.util.*;

/**
 * Abstract base class representing any system in the systemic ontology,
 * enforcing encapsulation, controlled mutation, and semantic integrity.
 */
public abstract class GenericSystemicOntology {

    // Private backing stores — protected from direct external access
    private final List<Purpose> purposes = new ArrayList<>();
    private final List<Stakeholder> stakeholders = new ArrayList<>();
    private final List<Entity> entities = new ArrayList<>();
    private final List<Input> inputs = new ArrayList<>();
    private final List<Output> outputs = new ArrayList<>();
    private final List<Process> processes = new ArrayList<>();
    private final List<DependencyType> dependencies = new ArrayList<>();
    private final List<BoundaryType> boundaries = new ArrayList<>();
    private final List<Modifier> modifiers = new ArrayList<>();
    private final List<State> states = new ArrayList<>();
    private final List<Goal> goals = new ArrayList<>();
    private final List<Repository> repositories = new ArrayList<>();
    private final List<FunctionalBehavior> functionalBehaviors = new ArrayList<>();
    private final List<BehavioralPattern> behavioralPatterns = new ArrayList<>();
    private final List<Problem> problems = new ArrayList<>();
    private final List<Need> needs = new ArrayList<>();

    public GenericSystemicOntology() {
        // Subclasses can add components during construction

    }

    public void setOutputs(Output output) {
         outputs.add(output);

    }

    public List<Output> getOutputs() {
        return outputs;
    }







}