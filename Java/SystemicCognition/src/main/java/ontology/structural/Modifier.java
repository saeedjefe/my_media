package ontology.structural;


public abstract class Modifier {

    public enum Category {

        STRUCTURAL,
        FUNCTIONAL,
        INFORMATION,
        ENVIRONMENTAL,
        ECONOMIC,
        SOCIAL,
        POLITICAL,
        TECHNOLOGICAL,
        REGULATORY,
        ORGANIZATIONAL
    }

    public enum InfluenceDirection {

        POSITIVE,
        NEGATIVE,
        BOTH
    }

    public enum InfluenceStrength {

        LOW,
        MEDIUM,
        HIGH
    }

}

