package org.example;


import layer_four_situation.Financial_Situation;
import layer_one.States.SystemState;
import layer_three.CulturalEvents;
import layer_three_situation.PersonalSituation;
import layer_three_situation.PoliticalSituation;
import layer_three_situation.ProfessionalSituation;
import layer_three_situation.SocialSituation;
import layer_two.Event;
import layer_two_sates.Situation;

public class Main {
    public static void main(String[] args) {

        CulturalEvents culturalEvents = new CulturalEvents();
        culturalEvents.addEvents(new Event("performing arts"));
        culturalEvents.addEvents(new Event("visual arts"));
        culturalEvents.addEvents(new Event(""));
        culturalEvents.printEvents();

        PoliticalSituation politicalSituation = new PoliticalSituation();
        PersonalSituation personalSituation =  new PersonalSituation();
        SocialSituation socialSituation = new SocialSituation();
        ProfessionalSituation professionalSituation = new ProfessionalSituation();

        Situation situation = new Situation();
        situation.addSituation(personalSituation);
        situation.addSituation(politicalSituation);
        situation.addSituation(socialSituation);
        situation.addSituation(professionalSituation);

        Financial_Situation financialSituation = new Financial_Situation();
        financialSituation.implementStates(SystemState.NORMAL);


    }
}