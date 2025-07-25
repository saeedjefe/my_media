package layer_two_sates;

import layer_one.States;

import java.util.ArrayList;

public class Situation  implements States {

    ArrayList<Situation> situations = new ArrayList<>();

    public void addSituation(Situation situation){
        situations.add(situation);
    }

    public ArrayList<Situation> getSituations() {
        return situations;
    }

    public void printSituation(){
        for(Situation situation: situations){
            System.out.println(situation);
        }
    }



    @Override
    public void implementStates(SystemState systemState) {

    }
}
