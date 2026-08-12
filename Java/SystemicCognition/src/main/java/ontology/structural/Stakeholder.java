package ontology.structural;


public abstract class Stakeholder {

    public enum Role {
        BENEFICIARY,
        USER,
        OPERATOR,
        OWNER,
        DECISION_MAKER,
        REGULATOR,
        FUNDER,
        SUPPLIER,
        CONTRACTOR,
        PARTNER,
        COMMUNITY,
        ENVIRONMENTAL_INTEREST
    }

    public enum Influence {
        LOW,
        MEDIUM,
        HIGH
    }

    public enum Interest {
        LOW,
        MEDIUM,
        HIGH
    }

    private  String name;
    private  Role role;
    private  Influence influence;
    private  Interest interest;

    // ...
}