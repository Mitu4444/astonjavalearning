package module.three.strategy;

import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class Potion {

    private PotionEffect effect;

    public Potion(PotionEffect effect){
        this.effect = Optional.ofNullable(effect).orElse(new SuperMysteryEffect());
    }

    public void setEffect(PotionEffect effect) {
        this.effect = Optional.ofNullable(effect).orElse(new SuperMysteryEffect());
    }

    public void drink(){
        effect.apply();
    }

}
