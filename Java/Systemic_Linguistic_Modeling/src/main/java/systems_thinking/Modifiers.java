package systems_thinking;

public interface Modifiers {


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

    enum InformationModifiers {
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

    // === Modifier Method Signatures ===
    void structuralModifiers(StructuralModifiers structuralModifiers);
    void functionalModifiers(FunctionalModifiers functionalModifiers);
    void informationModifiers(InformationModifiers informationModifiers);
    void contextualModifiers(ContextualModifiers contextualModifiers);
    void regulatoryModifiers(RegulatoryModifiers regulatoryModifiers);

}
