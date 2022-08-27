public class Tank extends Technique{

    public Tank(int id, String name, String model, int year) {
        super(id, name, model, year);
    }

    @Override
    public void oil() {
        System.out.println("Tank oil disiel");
    }

    @Override
    public void capacity() {
        System.out.println("4 capacity");
    }
}