package compositeOriol;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Mauri on 16/10/2015.
 */
public class Package implements AComponent {
    private List<AComponent> inside;
    private String name;

    public Package (String name){
        this.name = name;
        inside = new LinkedList<AComponent>();
    }

    public String putThingsInside(AComponent someThing){

        inside.add(someThing);
        return "In package("+name+") we have put the "+someThing.toString();
    }

    public String getName(){
        return "package("+name+")";
    }

    public int getSize(){ // recursibity :)
        int totalSize =0;
        for(AComponent list:inside){
            totalSize = totalSize+list.getSize();
        }
        return totalSize;
    }
}
