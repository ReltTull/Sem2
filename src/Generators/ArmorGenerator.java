package Generators;

import Rewards.ArmorReward;

public class ArmorGenerator extends ItemGenerator {
    @Override
    public GameItem createPrize() {
        return new ArmorReward();
    }
}
