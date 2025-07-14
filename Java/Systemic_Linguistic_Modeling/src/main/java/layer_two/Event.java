package layer_two;

import layer_one.*;


public  class Event  implements Behaviors, Input, Output, Modifiers{

         String name;

    public Event(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public void balanceOrientedBehavior() {

    }

    @Override
    public void changeOrientedBehavior() {

    }

    @Override
    public void integrationBehavior() {

    }

    @Override
    public void feedbackControlBehavior() {

    }

    @Override
    public void resilienceOrientedBehavior() {

    }

    @Override
    public void structuralModifiers() {

    }

    @Override
    public void functionalModifiers() {

    }

    @Override
    public void informationalModifiers() {

    }

    @Override
    public void contextualModifiers() {

    }

    @Override
    public void regulatoryModifiers() {

    }
}

