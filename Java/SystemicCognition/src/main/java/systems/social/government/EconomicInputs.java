package systems.social.government;


import ontology.behavioral.Input;

public class EconomicInputs implements Input {

    public final  String NAME = "economic inputs";

    public EconomicInputs(){

    }

    public String getNAME() {
        return NAME;
    }

    public String reasoningTree(){
     return getNAME();
    }


}
