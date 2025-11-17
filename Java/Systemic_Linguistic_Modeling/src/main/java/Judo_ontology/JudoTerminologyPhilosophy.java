package Judo_ontology;

public final class JudoTerminologyPhilosophy {
    enum JudoAction {
        NAGE("throw"),
        OTOSHI("drop"),
        GARI("reap"),
        GAKE("hook"),
        HARAI("sweep"),
        HANE("spring / springing lift"),
        GURUMA("wheel"),
        GAESHI("counter"),
        SUKUI("scoop"),
        TSURI("lift / hoist"),
        KOMI("pulling inward"),
        KUZUSHI("breaking balance");

        private final String meaning;

        JudoAction(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }

    enum MorphemeType { MODIFIER, BODY, ACTION, CLASS }

    enum JudoModifier {
        IPPON("single, full"),
        KO("small"),
        O("big"),
        DE("advancing"),
        OKURI("sliding, sending"),
        SASAE("propping"),
        SUMI("corner"),
        UKI("floating"),
        USHIRO("rear"),
        TANI("valley; backward sacrifice");

        private final String meaning;

        JudoModifier(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }

    enum JudoTechniqueClass {
        NAGE_WAZA("throwing techniques"),
        SUTEMI_WAZA("sacrifice techniques");

        private final String meaning;

        JudoTechniqueClass(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }

    enum JudoBodyPart {
        ASHI("foot / leg"),
        HIZA("knee"),
        SEOI("back / shoulder loading"),
        TAI("body / torso"),
        KOSHI("hip"),
        TE("hand / arm"),
        KATA("shoulder"),
        OBI("belt");

        private final String meaning;

        JudoBodyPart(String meaning) {
            this.meaning = meaning;
        }

        public String getMeaning() {
            return meaning;
        }
    }
}
