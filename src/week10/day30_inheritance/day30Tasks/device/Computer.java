package week10.day30_inheritance.day30Tasks.device;

public class Computer extends Device{
    private boolean hasWifi;
    private int capacity, ram, graphicsCard;
    private String CPU;

    public Computer(String brand, String model, String color, String size, double price, boolean hasBattery,
                    boolean hasPowerButton, boolean hasWifi, int capacity, int ram, int graphicsCard, String CPU) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
        this.hasWifi = hasWifi;
        this.capacity = capacity;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.CPU = CPU;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(int graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hasWifi=" + hasWifi +
                ", capacity=" + capacity +
                ", ram=" + ram +
                ", graphicsCard=" + graphicsCard +
                ", CPU='" + CPU + '\'' +
                '}';
    }
}
