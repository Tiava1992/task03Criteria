package by.tc.task01.entity;

import java.util.Locale;
import java.util.Objects;

public class VacuumCleaner extends Appliance{
    private String filterType = "Unknown";
    private String bagType = "Unknown";
    private String wandType = "Unknown";
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner() {
    }

    public VacuumCleaner(String manufacturer, double price, int powerConsumption, int weight, double height, double width) {
        super(manufacturer, price, powerConsumption, weight, height, width);
    }

    public VacuumCleaner(String manufacturer, double price, int powerConsumption, int weight,
                         double height, double width, String filterType, String bagType,
                         String wandType, int motorSpeedRegulation, int cleaningWidth) {
        super(manufacturer, price, powerConsumption, weight, height, width);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%d, %s=%s, %s=%s, %s=%s, %s=%d, %s=%d, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                "POWER_CONSUMPTION", getPowerConsumption(),
                "FILTER_TYPE", getFilterType(),
                "BAG_TYPE", getBagType(),
                "WAND_TYPE", getWandType(),
                "MOTOR_SPEED_REGULATION", getMotorSpeedRegulation(),
                "CLEANING_WIDTH", getCleaningWidth(),
                "MANUFACTURER", getManufacturer(),
                "PRICE", getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return motorSpeedRegulation == that.motorSpeedRegulation
                && cleaningWidth == that.cleaningWidth
                && Objects.equals(filterType, that.filterType)
                && Objects.equals(bagType, that.bagType)
                && Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }
}
