package ontology.behavioral;


/**
 * Represents recurring or characteristic behavioral patterns
 * exhibited by a system over time.
 */
public interface BehavioralPattern extends Behavior {

    enum BalanceOrientedTerm {
        EQUILIBRIUM,
        DISEQUILIBRIUM,
        STABILITY,
        DISRUPTION,
        SUSTAINABILITY,
        UNSUSTAINABILITY,
        HOMEOSTASIS,
        DYSREGULATION
    }

    enum ChangeOrientedTerm {
        ADAPTATION,
        RIGIDITY,
        RESILIENCE,
        VULNERABILITY,
        EMERGENCE,
        SUPPRESSION
    }

    enum InteractionPatternTerm {
        DYNAMICS,
        STATICS,
        COORDINATION,
        COOPERATION,
        COMPETITION,
        SYNCHRONIZATION
    }

    enum IntegrationPatternTerm {
        COHESION,
        FRAGMENTATION,
        HOMOGENIZATION,
        HETEROGENIZATION,
        ASSIMILATION,
        PLURALISM
    }

    enum FeedbackLoopTerm {
        POSITIVE_FEEDBACK_LOOP,
        NEGATIVE_FEEDBACK_LOOP
    }

    enum RepositoryTrendTerm {
        REPOSITORY_GROWTH,
        RESOURCE_DEPLETION,
        ACCUMULATION,
        DRAINAGE
    }

    enum ControlPatternTerm {
        REGULATION,
        DEREGULATION,
        STABILIZATION,
        OPTIMIZATION
    }
}


