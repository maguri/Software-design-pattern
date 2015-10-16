package decoratorOriol;

/**
 * Created by R522 on 16/10/2015.
 */
public class DecoratorB extends FuntionDecorator{

    public DecoratorB(Funtion f) {
        super(f);
    }

    public String toString(){
        return super.toString() + " B";
    }
}
