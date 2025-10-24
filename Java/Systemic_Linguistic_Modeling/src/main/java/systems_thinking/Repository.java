package systems_thinking;

public abstract class Repository  {

    String name;

    public Repository(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
