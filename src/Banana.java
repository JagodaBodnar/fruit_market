public class Banana extends Fruit {
    public Banana(){
        setCalories(88);
    }
    @Override
    public void makeJuice(){
        System.out.printf("Making banana juice %n");
    }
    public void peel(){
        System.out.printf("Peeling %n");
    }
}
