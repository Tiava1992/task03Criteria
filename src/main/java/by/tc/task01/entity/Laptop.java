package by.tc.task01.entity;

import java.util.Locale;
import java.util.Objects;

public class Laptop extends ComputerProduct{
    private String os="none";
    private int systemMemory;
    private double cpu;

    public Laptop() {
    }

    public Laptop(String manufacturer, double price, double batteryCapacity, int memoryRom, double displayInches, String os, int systemMemory, double cpu) {
        super(manufacturer, price, batteryCapacity, memoryRom, displayInches);
        this.os = os;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
    }

    public Laptop(String manufacturer, double price, double batteryCapacity, int memoryRom, double displayInches) {
        super(manufacturer, price, batteryCapacity, memoryRom, displayInches);
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,
                "%s : [%s=%.1f, %s=%s, %s=%d, %s=%d, %s=%.1f, %s=%.1f, %s=%s, %s=%.1f]",
                this.getClass().getSimpleName(),
                "BATTERY_CAPACITY", getBatteryCapacity(),
                "OS", getOs(),
                "MEMORY_ROM", getMemoryRom(),
                "SYSTEM_MEMORY", getSystemMemory(),
                "CPU", getCpu(),
                "DISPLAY_INCHES", getDisplayInches(),
                "MANUFACTURER", getManufacturer(),
                "PRICE", getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return systemMemory == laptop.systemMemory && Double.compare(laptop.cpu, cpu) == 0 && Objects.equals(os, laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(os, systemMemory, cpu);
    }
}
