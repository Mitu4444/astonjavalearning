package module.three.strategy;

import module.three.strategy.PotionEffect;

public abstract class Potion {

    public PotionEffect effect;

    public Potion(){
    }

    public abstract void display();

    public void apply(){
        effect.apply();
    }

}
