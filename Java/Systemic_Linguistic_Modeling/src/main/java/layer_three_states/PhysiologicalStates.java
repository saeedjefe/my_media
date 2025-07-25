package layer_three_states;

import layer_one.States;

public class PhysiologicalStates  implements States {

    @Override
    public void implementStates(SystemState systemState) {

    }

    enum BIOLOGICAL_STATE {
        AWAKE,
        ASLEEP,
        REM_SLEEP,
        NREM_SLEEP,
        FATIGUED,
        ENERGIZED,
        ILL,
        HEALTHY,
        STARVING,
        HYDRATED,
        PAINFUL,
        RESTED,
        HORMONAL_IMBALANCE,
        RECOVERING
    }
}
