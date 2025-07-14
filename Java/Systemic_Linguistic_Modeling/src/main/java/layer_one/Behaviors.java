package layer_one;

public interface Behaviors {

    // === Behavior Method Signatures ===
    void balanceOrientedBehavior();
    void changeOrientedBehavior();
    void integrationBehavior();
    void feedbackControlBehavior();
    void resilienceOrientedBehavior();

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

    // === NEW: Resilience-Oriented Terms ===
    enum ResilienceOrientedTerms {

        // ─── Core Systemic Tensions ───────────────────────────────
        RESILIENCE,             // ↔ VULNERABILITY
        VULNERABILITY,

        ROBUSTNESS,             // ↔ FRAGILITY
        FRAGILITY,



        FLEXIBILITY,            // ↔ RIGIDITY
        RIGIDITY,

        ELASTICITY,             // ↔ BRITTLE_RESPONSE
        BRITTLE_RESPONSE,

        ANTIFRAGILITY,          // ↔ DEGRADABILITY
        DEGRADABILITY,

        // ─── Adaptive vs. Static Behaviors ────────────────────────
        ADAPTATION,             // ↔ FIXITY
        FIXITY,

        SELF_ORGANIZATION,      // ↔ CENTRALIZED_CONTROL
        CENTRALIZED_CONTROL,

        FEEDBACK_INTEGRATION,   // ↔ FEEDBACK_SUPPRESSION
        FEEDBACK_SUPPRESSION,

        LEARNING,               // ↔ IGNORANCE
        IGNORANCE,

        PLASTICITY,             // ↔ INFLEXIBILITY
        INFLEXIBILITY,

        // ─── Preventive vs. Reactive Failures ─────────────────────
        PREPAREDNESS,           // ↔ UNPREPAREDNESS
        UNPREPAREDNESS,

        RESPONSIVENESS,         // ↔ DELAYED_RESPONSE
        DELAYED_RESPONSE,

        CONTAINMENT,            // ↔ ESCALATION
        ESCALATION,

        MITIGATION,             // ↔ EXACERBATION
        EXACERBATION,
        WEATHER_THE_PROBLEM
    }


}
