package decoratorOriol;

/**
 * Created by R522 on 16/10/2015.
 */
public class Funtion {

    public String getDefinition() {
        return definition;
    }

    private String definition;

    public Funtion(String f){
        definition = f;
    }

    public String toString(){
        return "I am the Funtion "+definition;
    }


}
