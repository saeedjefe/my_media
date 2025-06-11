package org.example;

import systemic_linguistic_modeling.society.SocialSystem;
import systemic_linguistic_modeling.society.government.GovernmentSystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        SocialSystem socialSystem = new SocialSystem();
        socialSystem.showEntities();
        socialSystem.showInputs();
        GovernmentSystem governmentSystem = new GovernmentSystem();
        governmentSystem.showEntities();
        governmentSystem.showInputs();

    }
}