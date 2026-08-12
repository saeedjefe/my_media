package systems.social.government;


import ontology.core.GenericSystemicOntology;

public class GovernmentSystem extends GenericSystemicOntology {

    //circular dependency
    private void assembleHierarchy() {
        PublicService publicService = new PublicService();
        this.setOutputs(publicService);
        InfrastructureService infrastructureService = new InfrastructureService();
        publicService.setOutputs(publicService);
        Utility utility = new Utility();
        infrastructureService.setOutputs(utility);
        WaterSupply waterSupply = new WaterSupply();
        utility.setOutputs(waterSupply);
    }
    public GovernmentSystem(){
        assembleHierarchy();
    }








}
