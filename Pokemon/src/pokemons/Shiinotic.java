package pokemons;

import moves.*;

public class Shiinotic extends Morelull {
    public Shiinotic(String name,int level) {
        super(name,level);
        setStats(60,45,80,90,100,30);
        setMove(new ChargeBeam());
    }
}
