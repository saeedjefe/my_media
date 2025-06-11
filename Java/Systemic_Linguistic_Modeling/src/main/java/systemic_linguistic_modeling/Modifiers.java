package systemic_linguistic_modeling;

public interface Modifiers {

    // === Modifier Method Signatures ===
    void structuralModifiers();
    void functionalModifiers();
    void informationalModifiers();
    void contextualModifiers();
    void regulatoryModifiers();

    // === Enums for Modifier Categories ===

    enum StructuralModifiers {
        REDUNDANCY,
        MODULARITY,
        INTERCONNECTIVITY,
        SEGMENTATION,
        SCALE,
        COUPLING,
        DIVERSITY
    }

    enum FunctionalModifiers {
        FLEXIBILITY,
        VERSATILITY,
        SPECIALIZATION,
        GENERALIZATION,
        RECONFIGURABILITY,
        LATENCY
    }

    enum InformationalModifiers {
        DATA_FLOW,
        FEEDBACK_LOOPS,
        SIGNAL_QUALITY,
        INFORMATION_TRANSPARENCY,
        SENSOR_DENSITY,
        KNOWLEDGE_ACCESS
    }

    enum ContextualModifiers {
        ENVIRONMENTAL_PRESSURE,
        SOCIAL_DEMAND,
        ECONOMIC_RESOURCES,
        POLITICAL_CONSTRAINTS,
        TECHNOLOGICAL_CHANGE
    }

    enum RegulatoryModifiers {
        GOVERNANCE,
        STANDARDS,
        POLICIES,
        LEGAL_CONSTRAINTS,
        NORMS,
        ENFORCEMENT
    }
}
