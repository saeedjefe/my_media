package layer_three_states;

import layer_one.States;

public class EmotionalStates implements States {

    @Override
    public void implementStates(SystemState systemState) {

    }

    enum EMOTIONAL_STATE {
            HAPPY,
            SAD,
            ANGRY,
            FEARFUL,
            ANXIOUS,
            CALM,
            EXCITED,
            DEPRESSED,
            HOPEFUL,
            FRUSTRATED,
            BOREDOM,
            GRATITUDE,
            JEALOUSY,
            GRIEF,
            EUPHORIA
        }

}
