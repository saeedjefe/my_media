package systemic_linguistic_modeling.society;

import systemic_linguistic_modeling.Entities;
import systemic_linguistic_modeling.System;

public class SocialSystem extends System {





     public SocialSystem() {
        super(new Entities());
        entities.addEntities(new Individuals("Citizens"));
        entities.addEntities(new Individuals("Migrants"));
        entities.addEntities(new Individuals("Refugees"));
        entities.addEntities(new Individuals("Activists"));
        entities.addEntities(new Individuals("Students"));
    }

    public void showEntities(){
         entities.printEntities();
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
    public void inputAcquisition() {

    }

    @Override
    public void internalTransformation() {

    }

    @Override
    public void outputProduction() {

    }

    @Override
    public void distribution() {

    }

    @Override
    public void feedbackReception() {

    }

    @Override
    public void modification() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public void growthDevelopment() {

    }

    @Override
    public void emergence() {

    }

    @Override
    public void replication() {

    }

    @Override
    public void dissolution() {

    }
}
