package adapterOriol;

/**
 * Created by R522 on 16/10/2015.
 */
public class EndollAdapterEuropeu extends Endoll {

    private EndollEuropeu interficiaAmericana;

    public EndollAdapterEuropeu(EndollEuropeu endoll){ interficiaAmericana = endoll;}

    public int getVoltatge(){return interficiaAmericana.getVoltatge();}
}
