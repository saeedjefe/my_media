package systems.social.government;

import ontology.behavioral.Input;

import java.util.ArrayList;

public class UtilityPayments extends ServiceFees{

    public final  String NAME = "utility payments";

    ArrayList<Input> inputs = new ArrayList<>();

    public UtilityPayments() {

    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void print_tree(){
        String indentation = "";
        System.out.println(indentation + getClass().getSimpleName());

        Utility utility = new Utility();
        inputs.add(new EconomicInputs());
        inputs.add(new NonTaxRevenues());

        for(Input input: inputs){
            if(input instanceof UtilityPayments) {
                ((UtilityPayments) input).print_tree();
            }
        }



    }

    }

