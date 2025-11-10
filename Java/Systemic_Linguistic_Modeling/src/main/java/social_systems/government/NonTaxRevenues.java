package social_systems.government;

public class NonTaxRevenues extends EconomicInputs{

    public final String Name = "non-tax revenues";
    public NonTaxRevenues() {
    }

    public String getName() {
        return Name;
    }

    @Override
    public String reasoningTree() {
        return super.reasoningTree() + getNAME();
    }
}
