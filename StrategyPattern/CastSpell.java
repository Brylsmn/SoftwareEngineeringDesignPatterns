package strategyPattern;

public class CastSpell implements AttackStrategy{
    public String Attack(){
        String output = new String();

        return output += "Wizard casts a spell!";
    }
}
