package systems_thinking;

public interface Processes {


    // === Enums for Process Terms (formerly 'Verb') ===

    enum InputAcquisitionTerms {
        FOUNTAINHEAD,
        SOURCING,
        PROCUREMENT,
        LOGISTICS,
        RECRUITMENT,
        INTAKE,
        ONBOARDING,
        COMPILATION,

    }

    enum InternalTransformationTerms {
        PROCESSING,
        ASSEMBLY,
        CALIBRATION,
        CONVERSION,
        CONFIGURATION,
        INTEGRATION
    }

    enum OutputProductionTerms {
        MANUFACTURING,
        SERVICE_EXECUTION,
        PACKAGING,
        RELEASE
    }

    enum DistributionTerms {
        ALLOCATION,
        ROUTING,
        DISPATCH,
        CHANNELING,
        EXPORT,
        OUTREACH,
        DISSEMINATION,
        DELIVERY,
        DISPERSING,
        BE_DISTRIBUTED
    }

    enum FeedbackReceptionTerms {
        MONITORING,
        EVALUATION,
        INSPECTION,
        AUDIT,
        FEEDBACK_COLLECTION,
        REPORTING
    }

    enum ModificationTerms {
        ADJUSTMENT,
        CALIBRATION,
        TUNING,
        REFORM,
        RECONFIGURATION,
        ADAPTATION
    }

    enum MaintenanceTerms {
        UPKEEP,
        INSPECTION,
        REPAIR,
        SERVICING,
        RENEWAL,
        CLEANING
    }

    enum GrowthDevelopmentTerms {
        SCALING,
        CAPACITY_BUILDING,
        OPTIMIZATION,
        EXPANSION,
        MATURATION
    }
    enum EmergenceTerms {
        INNOVATION,
        FORMATION,
        HYBRIDIZATION,
        SPONTANEOUS_ORGANIZATION
    }

    enum ReplicationTerms {
        DUPLICATION,
        CLONING,
        FRANCHISING,
        REPRODUCTION,
        PROLIFERATION
    }

    enum DissolutionTerms {
        DECOMMISSIONING,
        PHASING_OUT,
        DISMANTLING,
        DISINTEGRATION,
        RETIREMENT
    }


    // === Systemic Process Methods ===
    void inputAcquisition(InputAcquisitionTerms inputAcquisitionTerms);
    void internalTransformation(InternalTransformationTerms internalTransformationTerms);
    void outputProduction(OutputProductionTerms outputProductionTerms);
    void distribution(DistributionTerms distributionTerms);
    void feedbackReception(FeedbackReceptionTerms feedbackReceptionTerms);
    void modification(ModificationTerms modificationTerms);
    void maintenance(MaintenanceTerms maintenanceTerms);
    void growthDevelopment(GrowthDevelopmentTerms growthDevelopmentTerms);
    void emergence(EmergenceTerms emergenceTerms);
    void replication(ReplicationTerms replicationTerms);
    void dissolution(DissolutionTerms dissolutionTerms);

}



