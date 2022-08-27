public class Bayraktar extends Technique implements CanDo{
    public Bayraktar(int id, String name, String model, int year) {
        super(id, name, model, year);
    }

    @Override
    public void oil() {
        System.out.println("Bayraktar 80-oil");
    }

    @Override
    public void capacity() {
        System.out.println("5 orunduu");
    }

    @Override
    public void fly() {
        System.out.println("Bayraktar can fly");
    }
}
