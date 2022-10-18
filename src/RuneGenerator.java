public class RuneGenerator extends ItemGenerator {
    @Override
    public GameItem createPrize() {
        return new RuneReward();
    }
}
