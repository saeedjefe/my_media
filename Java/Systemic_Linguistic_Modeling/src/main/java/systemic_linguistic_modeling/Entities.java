package systemic_linguistic_modeling;

import java.lang.System;
import java.util.ArrayList;

public class Entities  {

    ArrayList<Entity> entities = new ArrayList<>();

    public void addEntities(Entity entity){
        entities.add(entity);
    }
    public void addInputs(){

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
