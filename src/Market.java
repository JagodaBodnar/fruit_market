public class Market {
    public static void main(String[] args) {
        System.out.println("-------------------");
        Fruit banana = new Banana();
        System.out.printf("Banana contains %d calories %n",((Banana)banana).getCalories());
        ((Banana)banana).peel();
        banana.makeJuice();
        review(banana);

        System.out.println("-------------------");
        Fruit apple = new Apple();
        System.out.printf("Apple contains %d calories %n",((Apple)apple).getCalories());
        ((Apple)apple).peel();
        ((Apple)apple).removeSeeds();
        apple.makeJuice();
        review(apple);
    }
    public static void review(Fruit fruit){
        if(fruit instanceof Apple){
            System.out.println("Juice was delicious!");
        }
        else if(fruit instanceof Banana){
            System.out.println("Juice was very tasty but too thick.");
        }
    }
}
