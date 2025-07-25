package layer_three_states;

import layer_one.States;

public class MoralStates  implements States {

    @Override
    public void implementStates(SystemState systemState) {

    }

    enum MORAL_STATE {
         GUILTY,
         INNOCENT,
         REMORSEFUL,
         COMPASSIONATE,
         SHAMED,
         PROUD,
         ETHICALLY_CONFLICTED
    }
}
