package layer_one;

import java.lang.System;
import java.util.ArrayList;

public class Repositories extends Repository{

    ArrayList<Repository> repositories = new ArrayList<>();

    public Repositories(String name) {
        super(name);
    }

    public void addRepositories(Repository repository){
        repositories.add(repository);
    }

    public ArrayList<Repository> getRepositories() {
        return repositories;
    }

    public void printRepositories(){
        for(Repository repository: repositories){
            System.out.println(repository.getClass().getSimpleName()+":"+repository.getName());

        }
        System.out.println();
    }
}
