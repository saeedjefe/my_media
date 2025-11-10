package social_systems.government;

public class ServiceFees extends  NonTaxRevenues{
  public final String NAME = "service fees";

    @Override
    public String reasoningTree() {
        return super.reasoningTree() + getNAME();
    }
}
