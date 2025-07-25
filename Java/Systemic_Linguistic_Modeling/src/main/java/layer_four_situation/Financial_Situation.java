package layer_four_situation;

import layer_three_situation.PersonalSituation;

import java.util.ArrayList;

public class Financial_Situation  extends PersonalSituation {

    SystemState systemState;
    ArrayList<String> personal_financial_states = new ArrayList<>();

    public Financial_Situation(){
    }



    @Override
    public void implementStates(SystemState systemState) {
        switch (systemState){
            case NORMAL -> System.out.println("normal financial situation");
        }
    }

}
