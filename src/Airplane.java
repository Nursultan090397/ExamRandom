public class Airplane extends Technique{
    public Airplane(int id, String name, String model, int year) {
        super(id, name, model, year);
    }

    @Override
    public void oil() {
        System.out.println("Airplane 92-oil");
    }

    @Override
    public void capacity() {
        System.out.println("7 orunduu");
    }
}
