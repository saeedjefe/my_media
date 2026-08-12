package org.example;

public  class System {

    Inputs inputs;
    Outputs outputs;

    public String dependency(){
        return this.getClass().getSimpleName() + "relies on" +
                this.inputs.getClass().getSimpleName() + "to provide" +
                this.outputs.getClass().getSimpleName();
    }
}
