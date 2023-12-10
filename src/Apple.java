public class Apple extends Fruit {
    public Apple(){
       setCalories(52);
    }
    @Override
    public void makeJuice(){
        System.out.printf("Making apple juice %n");
    }
    public void peel(){
        System.out.printf("Peeling %n");
    }
    public void removeSeeds(){
        System.out.printf("Removing seeds %n");
    }

}
