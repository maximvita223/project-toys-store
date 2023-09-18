class Toy{
    private Integer id;
    private String name;
    private int weight;

    public Toy(Integer id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
