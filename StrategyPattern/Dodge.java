package strategyPattern;

public class Dodge implements DefendStrategy{
    public String Defend(){
        String output = new String();

        return output += "Dodging to avoid attack!";
    }
}
