package adapterOriol;

/**
 * Created by R522 on 16/10/2015.
 */
public class Paret {

    private Endoll endoll;

    public 	Paret(Endoll tipus){
        endoll = tipus;

    }
    public String toString(){
        return ("voltatge: " +endoll.getVoltatge());
    }
}
