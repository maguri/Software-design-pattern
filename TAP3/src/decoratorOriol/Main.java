package decoratorOriol;

/**
 * Created by R522 on 16/10/2015.
 */
public class Main {

    public static void main(String[] args) {

        Funtion f1 = new Funtion("HelloWord");
        System.out.println(f1.toString());

        f1 = new DecoratorA(f1);
        System.out.println(f1.toString());
        f1 = new DecoratorB(f1);
        System.out.println(f1.toString());
    }
}
