package strategyPattern;

public class ShootArrow implements AttackStrategy{
    public String Attack(){
        String output = new String();

        return output += "Archer shoots an arrow!";
    }
}
