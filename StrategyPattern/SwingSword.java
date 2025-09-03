package strategyPattern;

public class SwingSword implements AttackStrategy{
    public String Attack(){
        String output = new String();

        return output += "Knight attacks with a sword!";
    }
}
