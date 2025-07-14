package layer_one;

public abstract class Entity {
    String name;

    public Entity(String name){
        this.name = name ;
    }

    public String getName() {
        return name;
    }
}
