package layer_one;

import java.lang.System;
import java.util.ArrayList;

public class Entities  {

    ArrayList<Entity> entities = new ArrayList<>();

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
