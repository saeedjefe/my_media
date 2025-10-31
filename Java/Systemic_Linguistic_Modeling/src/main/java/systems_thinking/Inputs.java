package systems_thinking;

import java.lang.System;
import java.util.ArrayList;

public class Inputs extends Input{
    ArrayList<Input> inputs = new ArrayList<>();
    String name;
    public Inputs(String name) {
        this.name = name;

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
