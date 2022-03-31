package by.tc.task01.entity;

import java.util.Locale;
import java.util.Objects;

public class TabletPC extends ComputerProduct{
    private int flashMemoryCapacity;
    private String color = "Unknown";

    public TabletPC() {
    }

    public TabletPC(String manufacturer, double price, double batteryCapacity, int memoryRom, double displayInches) {
        super(manufacturer, price, batteryCapacity, memoryRom, displayInches);
    }

    public TabletPC(String manufacturer, double price, double batteryCapacity, int memoryRom, double displayInches, int flashMemoryCapacity, String color) {
        super(manufacturer, price, batteryCapacity, memoryRom, displayInches);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%.1f, %s=%s, %s=%d, %s=%d, %s=%s, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                "BATTERY_CAPACITY", getBatteryCapacity(),
                "DISPLAY_INCHES", getDisplayInches(),
                "MEMORY_ROM", getMemoryRom(),
                "FLASH_MEMORY_CAPACITY", getFlashMemoryCapacity(),
                "COLOR", getColor(),
                "MANUFACTURER", getManufacturer(),
                "PRICE", getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return flashMemoryCapacity == tabletPC.flashMemoryCapacity && Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flashMemoryCapacity, color);
    }
}
