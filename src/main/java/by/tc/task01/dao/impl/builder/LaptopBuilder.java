package by.tc.task01.dao.impl.builder;

import by.tc.task01.entity.Laptop;

import java.util.Objects;

public class LaptopBuilder extends ApplianceBuilder {
    private final String lineWithParameters;

    public LaptopBuilder(final String lineWithParameters) {
        this.lineWithParameters = lineWithParameters;
    }

    @Override
    public Laptop build() {
        String[] parameters = findParameters(lineWithParameters);
        String manufacturer = parameters[6];
        double price = Double.parseDouble(parameters[7]);
        double batteryCapacity = Double.parseDouble(parameters[0]);
        int memoryRom = Integer.parseInt(parameters[2]);
        double displayInches = Double.parseDouble(parameters[5]);
        Laptop laptop = new Laptop(manufacturer, price, batteryCapacity, memoryRom, displayInches);

        if (!Objects.requireNonNull(parameters[1]).equals("null")) {
            laptop.setOs(parameters[1]);
        }
        if (!Objects.requireNonNull(parameters[3]).equals("null")) {
            laptop.setSystemMemory(Integer.parseInt(parameters[3]));
        }
        if (!Objects.requireNonNull(parameters[4]).equals("null")) {
            laptop.setCpu(Double.parseDouble(parameters[4]));
        }
        return laptop;
    }
}
