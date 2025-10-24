package systems_thinking;

/*this abstract class is a blueprint for the systems to be created in the future.
So far, we have identified several elements for systems thinking, each of which
should be declared as parameters inside the constructor of the subclasses of the
class system.
 */
public abstract class System implements  Behaviors, Dependencies, Processes, States, Modifiers{

     Entities entities;
    public System() {



    }

    public void addEntities(Entity entity){
        entities.addEntities(entity);
    }





    // Optional: Provide getters

    // etc...
}
