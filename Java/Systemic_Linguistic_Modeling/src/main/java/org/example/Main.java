package org.example;


import prompts.IeltsWritingTask2;
import prompts.TestFactory;
import social_systems.government.EconomicInputs;
import social_systems.government.UtilityPayments;
import social_systems.government.WaterSupply;
import systems_thinking.Output;

public class Main {
    public static void main(String[] args) {


        EconomicInputs economic_input = new EconomicInputs();
        UtilityPayments utility_payments = new UtilityPayments();
        System.out.println(utility_payments.reasoningTree());

        IeltsWritingTask2 ieltsWritingTask2 = TestFactory.produce();
        System.out.printf("%d, %d, %s\n%s",ieltsWritingTask2.getBook(), ieltsWritingTask2.getTest(), ieltsWritingTask2.getTypes(), ieltsWritingTask2.getText());

        Output waterSupply = new WaterSupply();


    }
}