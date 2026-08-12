package ontology.behavioral;


public interface FunctionalBehavior extends Behavior {

    enum InputReception {
        INTAKE,
        COLLECTION,
        ADMISSION,
        IMPORT
    }

    enum Preparation {
        SORTING,
        ASSEMBLY,
        CONFIGURATION,
        INITIALIZATION,
        CALIBRATION,
        INTEGRATION
    }

    enum Transformation {
        PROCESSING,
        CONVERSION,
        FABRICATION,
        COMPOSITION,
        COMPUTATION,
        TREATMENT
    }

    enum OutputProduction {
        MANUFACTURING,
        GENERATION,
        SERVICE_EXECUTION,
        PACKAGING,
        FINALIZATION
    }

    enum Distribution {
        ALLOCATION,
        ROUTING,
        DISPATCH,
        DELIVERY,
        DISSEMINATION,
        CHANNELING,
        EXPORT
    }

    enum Feedback {
        MONITORING,
        MEASUREMENT,
        INSPECTION,
        EVALUATION,
        AUDITING,
        REPORTING
    }

    enum Adaptation {
        ADJUSTMENT,
        TUNING,
        RECONFIGURATION,
        OPTIMIZATION,
        REFORM,
        ADAPTATION
    }

    enum Maintenance {
        CLEANING,
        SERVICING,
        REPAIR,
        REPLACEMENT,
        RESTORATION,
        UPKEEP
    }

    enum Growth {
        SCALING,
        CAPACITY_BUILDING,
        EXPANSION,
        MATURATION,
        DIVERSIFICATION
    }

    enum Emergence {
        FORMATION,
        SELF_ORGANIZATION,
        INNOVATION,
        DIFFERENTIATION,
        HYBRIDIZATION
    }

    enum Replication {
        REPRODUCTION,
        DUPLICATION,
        CLONING,
        FRANCHISING,
        PROLIFERATION
    }

    enum Dissolution {
        RETIREMENT,
        PHASING_OUT,
        DECOMMISSIONING,
        DISMANTLING,
        DISINTEGRATION
    }
}