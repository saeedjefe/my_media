package layer_three_states;

import layer_one.States;

public class DevelopmentalStages implements States {

    @Override
    public void implementStates(SystemState systemState) {

    }

    enum DEVELOPMENTAL_STATE {
         INFANCY,
         CHILDHOOD,
         ADOLESCENCE,
         ADULTHOOD,
         CAREGIVER,
         RETIRING
    }
}
