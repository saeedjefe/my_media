package systems_thinking;

import java.lang.System;
import java.util.ArrayList;

public class Inputs extends Input{
    ArrayList<Input> inputs = new ArrayList<>();

    public Inputs(String name) {
        super(name);
    }

    public void addInputs(Input input){
             inputs.add(input);
    }

    public ArrayList<Input> getInputs() {
        return inputs;
    }

    public void printInputs(){
        for(Input input: inputs) {
            System.out.println(input.getClass().getSimpleName() + ":" + input.name);
        }
    }
}
