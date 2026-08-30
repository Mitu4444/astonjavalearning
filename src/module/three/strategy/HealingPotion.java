package module.three.strategy;

public class HealingPotion extends Potion{

    public HealingPotion(){
        effect = new HealingEffect();
    }

    @Override
    public void display() {
        System.out.println("It's a potion that will cure you");
    }
}
