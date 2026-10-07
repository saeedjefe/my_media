package ontology.behavioral;


import ontology.core.Process;

public interface FunctionalBehavior extends Behavior {

    enum InputReception implements Process {
        INTAKE,
        COLLECTION,
        ADMISSION,
        IMPORT
    }

    enum Preparation implements Process{
        SORTING,
        ASSEMBLY,
        CONFIGURATION,
        INITIALIZATION,
        CALIBRATION,
        INTEGRATION
    }

    enum Transformation implements Process {
        PROCESSING,
        CONVERSION,
        FABRICATION,
        COMPOSITION,
        COMPUTATION,
        TREATMENT
    }

    enum OutputProduction implements Process{
        MANUFACTURING,
        GENERATION,
        SERVICE_EXECUTION,
        PACKAGING,
        FINALIZATION
    }

    enum Distribution implements Process{
        ALLOCATION,
        ROUTING,
        DISPATCH,
        DELIVERY,
        DISSEMINATION,
        CHANNELING,
        EXPORT
    }

    enum Feedback implements Process{
        MONITORING,
        MEASUREMENT,
        INSPECTION,
        EVALUATION,
        AUDITING,
        REPORTING
    }

    enum Adaptation implements Process{
        ADJUSTMENT,
        TUNING,
        RECONFIGURATION,
        OPTIMIZATION,
        REFORM,
        ADAPTATION
    }

    enum Maintenance implements Process{
        CLEANING,
        SERVICING,
        REPAIR,
        REPLACEMENT,
        RESTORATION,
        UPKEEP
    }

    enum Growth implements Process{
        SCALING,
        CAPACITY_BUILDING,
        EXPANSION,
        MATURATION,
        DIVERSIFICATION
    }

    enum Emergence implements Process{
        FORMATION,
        SELF_ORGANIZATION,
        INNOVATION,
        DIFFERENTIATION,
        HYBRIDIZATION
    }

    enum Replication implements Process{
        REPRODUCTION,
        DUPLICATION,
        CLONING,
        FRANCHISING,
        PROLIFERATION
    }

    enum Dissolution implements Process{
        RETIREMENT,
        PHASING_OUT,
        DECOMMISSIONING,
        DISMANTLING,
        DISINTEGRATION
    }
}