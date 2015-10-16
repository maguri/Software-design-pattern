package adapterOriol;

/**
 * Created by Mauri on 16/10/2015.
 */
public class main {

    public static void main(String[] args) {
        EndollAmerica eA = new EndollAmerica();
        EndollEuropeu eE = new EndollEuropeu();
        Paret p1 = new Paret(new EndollAdapterAmerica(eA));
        Paret p2 = new Paret(new EndollAdapterEuropeu(eE));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
