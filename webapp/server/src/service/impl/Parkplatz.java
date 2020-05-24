public class Parkplatz extends Strasse{
    // Assumption each strasse has only one parkplatz
    private String name;
    private Double cost;
    private Double probability;
    private Integer capacity;

    public Parkplatz(String addr, Integer plz, Integer capacity) {
        super(addr, plz);
        this.name = super.getName();
        this.setCapacity(capacity);
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public Integer getCapacity() {
        return this.capacity;
    }
    private void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    public String getName(){
        return this.name;
    }
    public Double getProbability() {
        return this.probability;
    }
    public void setProbability(Double probability) {
        this.probability = probability;
    }
}
