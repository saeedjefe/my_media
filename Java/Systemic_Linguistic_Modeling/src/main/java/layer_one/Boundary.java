package layer_one;

public abstract class Boundary  {
    String name;

    public Boundary(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
