package systemic_linguistic_modeling;

public interface Behaviors {

    // === Behavior Method Signatures ===
    void balanceOrientedBehavior();
    void changeOrientedBehavior();
    void integrationBehavior();
    void feedbackControlBehavior();

    // === Enums for Behavior Terms ===

    enum BalanceOrientedTerms {
        EQUILIBRIUM,
        DISEQUILIBRIUM,
        STABILITY,
        DISRUPTION,
        SUSTAINABILITY,
        UNSUSTAINABILITY,
        HOMEOSTASIS,
        DYSREGULATION
    }

    enum ChangeOrientedTerms {
        DYNAMICS,
        STATICS,
        ADAPTATION,
        RIGIDITY,
        RESILIENCE,
        VULNERABILITY,
        EMERGENCE,
        SUPPRESSION
    }

    enum IntegrationBehaviorTerms {
        COHESION,
        FRAGMENTATION,
        HOMOGENIZATION,
        HETEROGENIZATION,
        ASSIMILATION,
        PLURALISM
    }

    enum FeedbackControlTerms {
        POSITIVE_FEEDBACK_LOOP,
        NEGATIVE_FEEDBACK_LOOP,
        REPOSITORY_GROWTH,
        RESOURCE_DEPLETION,
        REGULATION,
        DEREGULATION
    }
}
