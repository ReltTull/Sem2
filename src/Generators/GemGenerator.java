package Generators;

import Rewards.GenReward;

public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createPrize() {
        return new GenReward();
    }
}
