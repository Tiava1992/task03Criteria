package by.tc.task01.entity;

import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;

public class Speakers extends Multimedia {
    private int powerOutput;
    private int numberOfSpeakers;
    private double cordLength;

    public Speakers() {
    }

    public Speakers(String manufacturer, double price, String frequencyRange) {
        super(manufacturer, price, frequencyRange);
    }

    public Speakers(String manufacturer, double price, String frequencyRange, int powerOutput, int numberOfSpeakers, double cordLength) {
        super(manufacturer, price, frequencyRange);
        this.powerOutput = powerOutput;
        this.numberOfSpeakers = numberOfSpeakers;
        this.cordLength = cordLength;
    }

    public int getPowerOutput() {
        return powerOutput;
    }

    public void setPowerOutput(int powerOutput) {
        this.powerOutput = powerOutput;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%d, %s=%s, %s=%s, %s=%.1f, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                "POWER_OUTPUT", getPowerOutput(),
                "NUMBER_OF_SPEAKERS", getNumberOfSpeakers(),
                "FREQUENCY_RANGE", getFrequencyRange(),
                "CORD_LENGTH", getCordLength(),
                "MANUFACTURER", getManufacturer(),
                "PRICE", getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return powerOutput == speakers.powerOutput
                && numberOfSpeakers == speakers.numberOfSpeakers
                && Double.compare(speakers.cordLength, cordLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerOutput, numberOfSpeakers, cordLength);
    }
}
