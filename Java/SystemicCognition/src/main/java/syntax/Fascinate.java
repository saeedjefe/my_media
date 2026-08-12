package syntax;

public  final class Fascinate implements ThematicRole, Emotional, PsychVerb, Causative {
    @Override
    public boolean causesState() {
        return true;
    }

    @Override
    public EmotionTypes emotionType() {
        return EmotionTypes.HAPPINESS;
    }

    public ThematicRoles subjectRole() {
        return ThematicRoles.STIMULUS;
    }

    public ThematicRoles objectRole() {
        return ThematicRoles.EXPERIENCER;
    }

    @Override
    public String lemma() {
        return "";
    }
}
