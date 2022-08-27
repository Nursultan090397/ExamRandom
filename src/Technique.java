public abstract class Technique {
    private int id;
    private String name;
    private String model;
    private int year;

    public Technique(int id, String name, String model, int year) {
        this.id = id;
        this.name = name;
        this.model = model;
        if (year>2018)
            this.year = year;
        else
            System.out.println("Technique эски жанысын алып келиниз");
    }

    public abstract void oil();
    public abstract void capacity();

    @Override
    public String toString() {
        return "-------------------------" +
                "\nid = " + id +
                "\nname ='" + name + '\'' +
                "\nmodel ='" + model + '\'' +
                "\nyear =" + year;
    }
}
