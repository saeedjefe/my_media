package systemic_linguistic_modeling.society;

import systemic_linguistic_modeling.Entities;
import systemic_linguistic_modeling.Inputs;
import systemic_linguistic_modeling.System;
import systemic_linguistic_modeling.society.government.Economic_inputs;

public class SocialSystem extends System {





     public SocialSystem() {
        super(new Entities(), new Inputs());
        entities.addEntities(new Individuals("Citizens"));
        entities.addEntities(new Individuals("Migrants"));
        entities.addEntities(new Individuals("Refugees"));
        entities.addEntities(new Individuals("Activists"));
        entities.addEntities(new Individuals("Students"));

        entities.addEntities(new Institutions("Government"));
        entities.addEntities(new Institutions("Schools"));
        entities.addEntities(new Institutions("Courts"));
        entities.addEntities(new Institutions("Religious Institutions"));
        entities.addEntities(new Institutions("Hospitals"));

        entities.addEntities(new Families("Nuclear Families"));
        entities.addEntities(new Families("Extended Families"));
        entities.addEntities(new Families("Single-parent Families"));
        entities.addEntities(new Families("Blended Families"));
        entities.addEntities(new Families("Foster Families"));

        inputs.addInputs(new Economic_inputs("Tax revenue"));


    }



    public void showEntities(){
         entities.printEntities();
    }

    public void showInputs(){
         inputs.printInputs();
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

    @Override
    public void structural_dependency() {

    }

    @Override
    public void resource_dependency() {

    }

    @Override
    public void functional_dependency() {

    }

    @Override
    public void temporal_dependency() {

    }

    @Override
    public void spatial_dependency() {

    }

    @Override
    public void causal_dependency() {

    }

    @Override
    public void hierarchical_dependency() {

    }

    @Override
    public void feedback_dependency() {

    }

    @Override
    public void environmental_dependency() {

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

    @Override
    public void setState(SystemState state) {

    }

    @Override
    public SystemState getState() {
        return null;
    }
}
