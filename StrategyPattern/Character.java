package strategyPattern;

public class Character {
    private AttackStrategy attackStrategy;
    private DefendStrategy defendStrategy;

    public Character(String type) {

    }

    public void SetAttack(AttackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    }

    public void SetDefend(DefendStrategy defendStrategy){
        this.defendStrategy = defendStrategy;
    }

    public String Attack(){
        return attackStrategy.Attack();
    }

    public String Defense(){
        return defendStrategy.Defend();
    }
}
