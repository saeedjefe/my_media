package systems.social.government;



import java.util.ArrayList;

public class WaterSupply extends Utility {



    ArrayList<String> waterSupplyOutputs = new ArrayList<>();



    public WaterSupply(){


           initializeOutput();


    }


    private void initializeOutput(){


        waterSupplyOutputs.add("potable water");
        waterSupplyOutputs.add("water quality reports");
        waterSupplyOutputs.add("usage information");
        waterSupplyOutputs.add("treatment byproducts");
    }




    public ArrayList<String> getWaterSupplyOutputs() {
        return waterSupplyOutputs;
    }
}


