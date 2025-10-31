package human_systems.nervous.auditory;

import systems_thinking.*;
import systems_thinking.System;

public class AuditorySystem extends System {

   Entities entities = new Entities("AuditorySystem");
   ExternalEar externalEar ;
   MiddleEar middleEar;
   InnerEar innerEar;
   BrainStem brainStem;
   AuditoryInput auditoryInput;

    public AuditorySystem(Entities entities, Inputs inputs, Outputs outputs, Goals goals, Repositories repositories, Attributes attributes, Boundaries boundaries) {
        super(entities, inputs, outputs, goals, repositories, attributes, boundaries);


    }
    public AuditorySystem(){
     entities.addEntities(externalEar);
     entities.addEntities(middleEar);
     entities.addEntities(innerEar);
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
    public void implementStates(SystemState systemState) {

    }

 @Override
 public Entities getEntities() {
  return entities;
 }
}
