package by.tc.task01.entity;

import java.util.Objects;

public class Multimedia extends Product{
    private String frequencyRange;

    public Multimedia() {
    }

    public Multimedia(String manufacturer, double price, String frequencyRange) {
        super(manufacturer, price);
        this.frequencyRange = frequencyRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multimedia that = (Multimedia) o;
        return Objects.equals(getFrequencyRange(), that.getFrequencyRange());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFrequencyRange());
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }
}
