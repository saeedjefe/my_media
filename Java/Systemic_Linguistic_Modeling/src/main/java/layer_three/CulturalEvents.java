package layer_three;

import layer_two.Event;

import java.util.ArrayList;

public class CulturalEvents   {

    ArrayList<Event> events = new ArrayList<>();


    public void addEvents(Event event){
        events.add(event);
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void printEvents(){
        for(Event event: events){
            System.out.println(event.getClass().getSimpleName()+":"+event.getName());
        }
    }


}
