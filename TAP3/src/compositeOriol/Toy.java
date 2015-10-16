package compositeOriol;

/**
 * Created by R522 on 16/10/2015.
 */
public class Toy implements  AComponent{

    private String name;
    private int size;

    public Toy(String name, int size){
        this.size = size;
        this.name = name;
    }

    public int getSize(){
        return size;
    }

    public String getName(){
        return "Toy("+name+")";
    }
}
