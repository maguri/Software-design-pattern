package adapterOriol;

/**
 * Created by R522 on 16/10/2015.
 */
public class EndollAdapterAmerica extends Endoll {

    private EndollAmerica interficiaAmericana;

    public EndollAdapterAmerica( EndollAmerica endoll){ interficiaAmericana = endoll;}

    public int getVoltatge(){return interficiaAmericana.getVoltatge();}
}
