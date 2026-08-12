package Judo;

public final class JudoTerminologyPhilosophy {



    enum JudoModifier {

        // Scalar
        IPPON("single, full", Category.SCALAR),
        KO("small", Category.SCALAR),
        O("big", Category.SCALAR),

        // Directional / Spatial
        MAE("front, forward", Category.DIRECTIONAL),
        SUMI("corner", Category.DIRECTIONAL),
        SOTO("outer", Category.DIRECTIONAL),
        UCHI("inner", Category.DIRECTIONAL),
        USHIRO("rear", Category.DIRECTIONAL),
        YOKO("side", Category.DIRECTIONAL),

        // Motion / Energy Quality
        DE("advancing", Category.MOTION),
        HIKI("pulling", Category.MOTION),
        OKURI("sliding, sending", Category.MOTION),
        UKI("floating", Category.MOTION),
        TSURI("lifting / hoisting", Category.MOTION),
        KOMI("pulling inward", Category.MOTION),
        TSURI_KOMI("lifting and pulling (combined)", Category.MOTION),

        // Mechanical / Structural
        ASHI("foot/leg (modifier use)", Category.MECHANICAL),
        OBI("belt (modifier use)", Category.MECHANICAL),
        SASAE("propping", Category.MECHANICAL),
        TANI("valley; backward sacrifice", Category.MECHANICAL),

        // Grip / Hand Usage Modifiers
        MOROTE("both hands (grip style)", Category.GRIP),
        KATA("one hand (grip style)", Category.GRIP);

        private final String meaning;
        private final Category category;

        JudoModifier(String meaning, Category category) {
            this.meaning = meaning;
            this.category = category;
        }

        public String getMeaning() { return meaning; }
        public Category getCategory() { return category; }

        enum Category { SCALAR, DIRECTIONAL, MOTION, MECHANICAL, GRIP }
    }



        enum Category { SCALAR, DIRECTIONAL, MOTION, MECHANICAL }



    enum JudoBodyPartRoot {

        // Upper Body
        TE("hand / arm", Category.UPPER_BODY),
        UDE("arm / forearm", Category.UPPER_BODY),
        KATA("shoulder", Category.UPPER_BODY),
        SEOI("shoulder/back loading point", Category.UPPER_BODY),
        KUBI("neck", Category.UPPER_BODY),
        MUNE("chest", Category.UPPER_BODY),

        // Core
        TAI("torso", Category.CORE),
        HARA("abdomen", Category.CORE),
        KOSHI("hip", Category.CORE),
        OBI("belt", Category.CORE),

        // Lower Body
        ASHI("leg / foot", Category.LOWER_BODY),
        HIZA("knee", Category.LOWER_BODY);

        private final String meaning;
        private final Category category;

        JudoBodyPartRoot(String meaning, Category category) {
            this.meaning = meaning;
            this.category = category;
        }

        public String getMeaning() { return meaning; }
        public Category getCategory() { return category; }

        enum Category { UPPER_BODY, CORE, LOWER_BODY }
    }

    enum JudoActionRoot {

        // Reaping / Sweeping
        GARI("reap", Category.REAPING),
        HARAI("sweep", Category.SWEEPING),
        BARAI("sweep variant", Category.SWEEPING),
        HANE("springing lift / spring sweep", Category.SWEEPING),

        // Lifting, Pulling, Loading
        TSURI("lift / hoist", Category.LIFTING),
        KOMI("pull inward", Category.PULLING),
        KUZUSHI("break balance", Category.PULLING),

        // Dropping / Sacrifice
        OTOSHI("drop", Category.DROPPING),

        // Rotational
        GURUMA("wheel", Category.ROTATIONAL),
        MAKI("wrap", Category.ROTATIONAL),

        // Hooking / Scooping
        GAKE("hook", Category.HOOKING),
        SUKUI("scoop", Category.HOOKING),

        // Counters
        GAESHI("counter / reverse", Category.COUNTER),

        // Throwing (base action)
        NAGE("throw", Category.THROWING),

        // Ground / Immobilizations
        KATA("hold", Category.CONTROL),
        GATAME("lock / immobilize", Category.CONTROL);

        private final String meaning;
        private final Category category;

        JudoActionRoot(String meaning, Category category) {
            this.meaning = meaning;
            this.category = category;
        }

        public String getMeaning() { return meaning; }
        public Category getCategory() { return category; }

        enum Category {
            REAPING, SWEEPING, LIFTING, PULLING,
            DROPPING, ROTATIONAL, HOOKING,
            COUNTER, THROWING, CONTROL
        }
    }

    enum JudoShapeRoot {
        TOMOE("comma-shaped swirl; circular rotation symbol", Category.CIRCULAR);

        private final String meaning;
        private final Category category;

        JudoShapeRoot(String meaning, Category category) {
            this.meaning = meaning;
            this.category = category;
        }

        public String getMeaning() { return meaning; }
        public Category getCategory() { return category; }

        enum Category { CIRCULAR }
    }

    enum JudoTechniqueClass {

        // Standing Techniques
        TE_WAZA("hand techniques", Category.STANDING),
        KOSHI_WAZA("hip techniques", Category.STANDING),
        ASHI_WAZA("foot/leg techniques", Category.STANDING),

        // Throwing (general)
        NAGE_WAZA("throwing techniques", Category.STANDING),

        // Sacrifice Techniques
        MA_SUTEMI_WAZA("rear sacrifice techniques", Category.SACRIFICE),
        YOKO_SUTEMI_WAZA("side sacrifice techniques", Category.SACRIFICE),
        SUTEMI_WAZA("sacrifice techniques", Category.SACRIFICE),

        // Ground techniques
        OSAEKOMI_WAZA("holding techniques", Category.GROUND),
        SHIME_WAZA("strangulation techniques", Category.GROUND),
        KANSETSU_WAZA("joint lock techniques", Category.GROUND),
        KATAME_WAZA("grappling techniques", Category.GROUND);

        private final String meaning;
        private final Category category;

        JudoTechniqueClass(String meaning, Category category) {
            this.meaning = meaning;
            this.category = category;
        }

        public String getMeaning() { return meaning; }
        public Category getCategory() { return category; }

        enum Category { STANDING, SACRIFICE, GROUND }
    }


}


