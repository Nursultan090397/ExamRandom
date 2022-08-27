public class Sidan extends Technique{
    public Sidan(int id, String name, String model, int year) {
        super(id, name, model, year);
    }

    @Override
    public void oil() {
        System.out.println("Sidan 90-oil");
    }

    @Override
    public void capacity() {
        System.out.println("4 orunduu");
    }
}
