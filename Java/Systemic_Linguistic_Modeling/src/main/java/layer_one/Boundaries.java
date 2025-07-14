package layer_one;

import java.lang.System;
import java.util.ArrayList;

public class Boundaries extends Boundary {
    ArrayList<Boundary> boundaries = new ArrayList<>();

    public Boundaries(String name) {
        super(name);
    }

    public void addBoundaries(Boundary boundary){
        boundaries.add(boundary);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void printBoundaries(){
        for(Boundary boundary: boundaries){
            System.out.println(boundary.getClass().getSimpleName()+":"+boundary.getName());
        }
    }

}
