package Generators;

import Rewards.GoldReward;

public class GoldGenerator extends ItemGenerator {
    @Override
    public GameItem createPrize() {
        return new GoldReward();
    }
}
