package ontology.managerial;


/**
 * Represents organizational activities that establish, govern,
 * resource, and support an operational system.
 */

public final class PlanningAndManagement {

    public  PlanningAndManagement() {   }

    public enum DecisionMaking {
        PROBLEM_RECOGNITION,
        NEED_ASSESSMENT,
        PURPOSE_DEFINITION,
        GOAL_SETTING,
        SYSTEM_STRUCTURE_DEFINITION,
        OPTION_EVALUATION,
        SELECTION,
        AUTHORIZATION
    }

    public enum Planning {
        FORECASTING,
        SCHEDULING,
        CAPACITY_PLANNING,
        RESOURCE_PLANNING,
        CONTINGENCY_PLANNING
    }

    public enum ResourceAcquisition {
        SOURCING,
        PROCUREMENT,
        SUPPLIER_SELECTION,
        CONTRACTING,
        FUNDING
    }

    public enum ResourceMobilization {
        RESOURCE_ALLOCATION,
        RESOURCE_ASSIGNMENT,
        RESOURCE_DEPLOYMENT,
        RESOURCE_ACTIVATION
    }

    public enum HumanResourceManagement {
        RECRUITMENT,
        TRAINING,
        ASSIGNMENT,
        WORKFORCE_PERFORMANCE_MANAGEMENT,
        RETENTION
    }

    public enum AssetManagement {
        ASSET_REGISTRATION,
        CONDITION_ASSESSMENT,
        RENEWAL_PLANNING,
        DISPOSAL,
        LIFECYCLE_MANAGEMENT
    }

    public enum Governance {
        POLICY_DEVELOPMENT,
        COMPLIANCE_MANAGEMENT,
        RISK_MANAGEMENT,
        QUALITY_MANAGEMENT,
        SYSTEM_PERFORMANCE_MANAGEMENT
    }
}