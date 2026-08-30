package module.three.strategy;

public class HealingEffect implements PotionEffect{

    @Override
    public void apply() {
        System.out.println("You're healed.");
    }
}
