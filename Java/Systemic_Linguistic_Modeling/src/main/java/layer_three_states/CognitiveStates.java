package layer_three_states;

import layer_one.States;

public class CognitiveStates implements States {
    @Override
    public void implementStates(SystemState systemState) {

    }

    enum COGNITIVE_STATE {
        ALERT,
                DISTRACTED,
                FOCUSED,
                CONFUSED,
                CREATING,
                PROBLEM_SOLVING,
                DAYDREAMING,
                MEDITATIVE,
                REMEMBERING,
                FORGETTING,
                LEARNING,
                DECIDING
    }
}
