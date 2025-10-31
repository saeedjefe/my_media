package org.example;


import human_systems.nervous.auditory.AuditoryInput;
import human_systems.nervous.auditory.AuditorySystem;
import society.government.GovernmentSystem;
import society.government.UtilityPayments;
import systems_thinking.Inputs;

public class Main {
    public static void main(String[] args) {


        GovernmentSystem governmentSystem = new GovernmentSystem();
        UtilityPayments utilityPayments = new UtilityPayments("Utility Payments");
        utilityPayments.addInputs(new Inputs("gas"));
        utilityPayments.printInputs();


        AuditorySystem auditorySystem = new AuditorySystem();
        AuditoryInput auditoryInput = new AuditoryInput("auditory inputs");
        auditoryInput.addInputs(new Inputs("sound"));
        auditoryInput.printInputs();









    }
}