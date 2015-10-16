package compositeOriol;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by R522 on 16/10/2015.
 */
public class Main {
    public static void main(String[] args) {

        Package p1 = new Package("p1");
        Package p2 = new Package("p2");
        Package p3 = new Package("p3");
        Package p4 = new Package("p4");
        Package p5 = new Package("p5");

        Toy t1 = new Toy("t1",1);
        Toy t2 = new Toy("t2",2);
        Toy t3 = new Toy("t3",3);
        Toy t4 = new Toy("t4",4);
        Toy t5 = new Toy("t5",5);
        Toy t6 = new Toy("t6",6);

        p1.putThingsInside(p2);
        p1.putThingsInside(p3);
        p2.putThingsInside(p4);
        p2.putThingsInside(t1);
        p3.putThingsInside(t2);
        p3.putThingsInside(t5);
        p3.putThingsInside(t6);
        p4.putThingsInside(p5);
        p4.putThingsInside(t3);
        p5.putThingsInside(t4);

        List<Package> listP = new LinkedList<Package>();
        listP.add(p1);
        listP.add(p2);
        listP.add(p3);
        listP.add(p4);
        listP.add(p5);

        for(Package p:listP){
            System.out.println("Name->"+p.getName()+"Inside->"+p.getSize());
        }
    }
}
