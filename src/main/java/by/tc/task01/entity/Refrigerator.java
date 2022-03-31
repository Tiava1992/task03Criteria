package by.tc.task01.entity;

import java.util.Locale;
import java.util.Objects;

public class Refrigerator extends Appliance{
    private double freezerCapacity;
    private double overallCapacity;

    public Refrigerator() {
    }

    public Refrigerator(String manufacturer, double price, int powerConsumption, int weight, double height, double width) {
        super(manufacturer, price, powerConsumption, weight, height, width);
    }

    public Refrigerator(String manufacturer, double price, int powerConsumption, int weight, double height, double width, double freezerCapacity, double overallCapacity) {
        super(manufacturer, price, powerConsumption, weight, height, width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%d, %s=%s, %s=%.1f, %s=%.1f, %s=%.1f, %s=%.1f, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                "POWER_CONSUMPTION", getPowerConsumption(),
                "WEIGHT", getWeight(),
                "FREEZER_CAPACITY", getFreezerCapacity(),
                "OVERALL_CAPACITY", getOverallCapacity(),
                "HEIGHT", getHeight(),
                "WIDTH", getWidth(),
                "MANUFACTURER", getManufacturer(),
                "PRICE", getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.freezerCapacity, freezerCapacity) == 0
                && Double.compare(that.overallCapacity, overallCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(freezerCapacity, overallCapacity);
    }
}
