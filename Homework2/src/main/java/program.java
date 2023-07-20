public class program {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Леша");
        Human human2 = new Human("Миша");
        Human human3 = new Human("Саша");

        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
        market.update();
    }
}
