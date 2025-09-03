package strategyPattern;
public class GameApp {
    public static void main(String[] args){

        Character knight = new Character("Knight");
        Character wizard = new Character("Wizard");
        Character archer = new Character("Archer");

        knight.SetAttack(new SwingSword());
        knight.SetDefend(new Shield());
        wizard.SetAttack(new CastSpell());
        wizard.SetDefend(new CreateMagic());
        archer.SetAttack(new ShootArrow());
        archer.SetDefend(new Dodge());

        System.out.println(knight.Attack());
        System.out.println(knight.Defense());
        System.out.println(wizard.Attack());
        System.out.println(wizard.Defense());
        System.out.println(archer.Attack());
        System.out.println(archer.Defense());
    }
}
