package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Morelull extends Pokemon {
    public Morelull(String name,int level) {
        super(name,level);
        setType(Type.GRASS,Type.FAIRY);
        setStats(40,35,55,65,75,15);
        setMove(new EnergyBall(), new DazzlingGleam(), new Moonblast());
    }
}
