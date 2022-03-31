package by.tc.task01.entity;

import java.util.Objects;

public abstract class Appliance extends Product {
    private int powerConsumption;
    private int weight;
    private double height;
    private double width;

    public Appliance() {
    }

    public Appliance(String manufacturer, double price, int powerConsumption, int weight, double height, double width) {
        super(manufacturer, price);
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return getPowerConsumption() == appliance.getPowerConsumption() && getWeight() == appliance.getWeight() && Double.compare(appliance.getHeight(), getHeight()) == 0 && Double.compare(appliance.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
            return Objects.hash(getPowerConsumption(), getWeight(), getHeight(), getWidth());
    }
}
