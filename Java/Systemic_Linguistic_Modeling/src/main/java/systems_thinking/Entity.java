package systems_thinking;

public interface  Entity {

  enum EntityTypes{
    BIOLOGICAL,
    ORGANIZATIONAL,
    CONCEPTUAL,
    ENVIRONMENTAL
  }
  void addEntities(EntityTypes entityTypes);
}
