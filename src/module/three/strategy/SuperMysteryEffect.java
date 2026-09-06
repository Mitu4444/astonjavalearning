package module.three.strategy;

public class SuperMysteryEffect implements PotionEffect{

    @Override
    public void apply() {
        System.out.println("You drank some plain water and quenched your thirst.");
    }
}
