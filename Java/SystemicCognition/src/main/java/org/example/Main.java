package org.example;

import systems.social.government.GovernmentSystem;
import systems.social.government.WaterSupply;

public class Main {
    public static void main(String[] args) {

        GovernmentSystem governmentSystem = new GovernmentSystem();

        WaterSupply waterSupply = new WaterSupply();
        for(String waterSupplyOutput: waterSupply.getWaterSupplyOutputs()){
            System.out.println(waterSupplyOutput);
        }

    }


}