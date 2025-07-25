package layer_one;

import java.lang.System;
import java.util.ArrayList;

public class Entities extends Entity {

    ArrayList<Entity> entities = new ArrayList<>();

    public Entities(String name) {
        super(name);
    }

    public void addEntities(Entity entity){
        entities.add(entity);
    }


    public ArrayList<Entity> getEntities() {
        return entities;
    }

    public void printEntities(){
        for(Entity entity: entities){

            System.out.println(entity.getClass().getSimpleName()+":"+entity.getName()  );
        }
    }
}
