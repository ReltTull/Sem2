public class ArmorGenerator extends ItemGenerator {
    @Override
    public GameItem createPrize()
    { // создаем объект возвращаемого значения
        return new ArmorReward();
    }
}
