package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pachirisu extends Pokemon {
    public Pachirisu(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(60,45,70,45,90,95);
        setMove(new Charm(), new Confide(), new ThunderWave(), new Bite());
    }
}
