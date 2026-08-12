package ontology.structural;

public abstract class Resource {

    public enum Category {
        NATURAL,
        MATERIAL,
        ENERGY,
        INFORMATION,
        FINANCIAL,
        HUMAN,
        TECHNOLOGICAL,
        INFRASTRUCTURAL
    }

    public enum Availability {
        AVAILABLE,
        LIMITED,
        UNAVAILABLE
    }

    public enum Renewability {
        RENEWABLE,
        NON_RENEWABLE
    }

    public enum Ownership {
        INTERNAL,
        EXTERNAL,
        SHARED
    }

    public enum Criticality {
        NON_CRITICAL,
        IMPORTANT,
        CRITICAL
    }

    public enum Role {
        OPERATIONAL,
        ENABLING
    }
}
