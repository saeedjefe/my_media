package org.example;


import layer_three.CulturalEvents;
import layer_two.Event;

public class Main {
    public static void main(String[] args) {

        CulturalEvents culturalEvents = new CulturalEvents();
        culturalEvents.addEvents(new Event("performing arts"));
        culturalEvents.addEvents(new Event("visual arts"));
        culturalEvents.addEvents(new Event(""));
        culturalEvents.printEvents();


    }
}