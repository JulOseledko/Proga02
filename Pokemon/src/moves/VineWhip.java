package moves;

import ru.ifmo.se.pokemon.*;

public class VineWhip extends PhysicalMove {
    public VineWhip() {
        super(Type.GRASS, 45,100);
    }
    @Override
    protected String describe() {
        return "использует Vine Whip";
    }
}
