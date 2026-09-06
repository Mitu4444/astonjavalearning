package module.three.strategy;

public class StrengthEffect implements PotionEffect{

    @Override
    public void apply() {
        System.out.println("You're as strong as a hero!");
    }
}
