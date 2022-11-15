package the_Battle;

import ru.ifmo.se.pokemon.Battle;
import pokemons.*;

class The_Battle {
    public static void main(String[] args){
        Battle b = new Battle();
        Flabebe p1 = new Flabebe("Желание_Жить",1);
        Morelull p2 = new Morelull("Сон",1);
        Shiinotic p3 = new Shiinotic("Jul",1);
        Florges p4 = new Florges("Матан",99);
        Pachirisu p5 = new Pachirisu("Прога",99);
        Floette p6 = new Floette("Алгосы",999);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4); 
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}
