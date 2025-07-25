package layer_three_states;

import layer_one.States;

public class SocialStates implements States {

    @Override
    public void implementStates(SystemState systemState) {

    }

    enum SOCIAL_STATE {
        CONNECTED,
        ISOLATED,
        ACCEPTED,
        REJECTED,
        TRUSTED,
        DISTRUSTED,
        DOMINANT,
        SUBMISSIVE,
        IN_LOVE,
        LONELY,
        INCLUDED,
        EXCLUDED
    }

}
