public class Parkplatz extends Strasse{
    // Assumption each strasse has only one parkplatz
    private String name;
    private Double cost;
    private Double probability;
    private Integer capacity;

    public Parkplatz(String addr, Integer plz, Integer capacity) {
        super(addr, plz);
        this.name = getName();
        this.capacity =capacity;
    }
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }
    public Integer getCapacity() {
        return capacity;
    }
    public String getName(){
        return name;
    }
    public Double getProbability() {
        return probability;
    }
    public void setProbability(Double probability) {
        this.probability = probability;
    }
}
