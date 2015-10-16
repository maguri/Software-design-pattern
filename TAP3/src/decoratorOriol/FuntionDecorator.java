package decoratorOriol;

/**
 * Created by R522 on 16/10/2015.
 */
public class FuntionDecorator extends Funtion {

    private Funtion funtion;

    public FuntionDecorator(Funtion f){
        super(f.getDefinition());
        funtion = f;
    }
    @Override
    public String toString() {
        return funtion.toString();
    }
}
