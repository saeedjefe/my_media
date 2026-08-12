package org.example;

public class Outputs {

    Inputs inputs;
    public String dependency(){
        return this.toString() + "rely on" + inputs.toString();
    }
}
