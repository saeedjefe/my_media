package syntax;
// Feature-based composition
public final class Frighten
        implements PsychVerb, Emotional, Causative, ThematicRole {

    @Override
    public String lemma() {
        return "frighten";
    }

    @Override
    public EmotionTypes emotionType() {
        return EmotionTypes.FEAR;
    }

    @Override
    public boolean causesState() {
        return true;
    }

    @Override
    public ThematicRoles subjectRole() {
        return ThematicRoles.STIMULUS;
    }


    @Override
    public ThematicRoles objectRole() {
        return ThematicRoles.EXPERIENCER;
    }

}
