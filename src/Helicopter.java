public class Helicopter extends Technique implements CanDo{
    public Helicopter(int id, String name, String model, int year) {
        super(id, name, model, year);
    }

    @Override
    public void oil(){
        System.out.println("Helicopter 95-oil");
    }

    @Override
    public void capacity() {
        System.out.println("5 orunduu");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter can fly");
    }
}
