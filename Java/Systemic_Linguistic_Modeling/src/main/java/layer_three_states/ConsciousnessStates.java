package layer_three_states;

import layer_one.States;

public class ConsciousnessStates  implements States {

    @Override
    public void implementStates(SystemState systemState) {

    }

    enum  CONSCIOUSNESS_STATE {
        FULLY_CONSCIOUS,
        SUBCONSCIOUS,
        UNCONSCIOUS,
        ALTERED_CONSCIOUSNESS,
        HYPNOTIC,
        FLOW_STATE,
        DISSOCIATIVE,
        DREAMING,
        AWARE,
        AUTOMATIC_BEHAVIOR
    }
}
