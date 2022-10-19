public abstract class ItemGenerator {

    // абстрактный метод, при расширении которого в наследниках возвращается объект соответствующего класса-награды
    public abstract GameItem createPrize ();

    public void openReward()
    { // инициализация экземпляра класса "...Reward", полученного в createPrize() и вывод сообщения
        GameItem rewardPrize = createPrize();
        rewardPrize.open();
    }



}
