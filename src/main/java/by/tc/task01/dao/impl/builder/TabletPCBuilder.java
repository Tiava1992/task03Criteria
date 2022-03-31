package by.tc.task01.dao.impl.builder;

import by.tc.task01.entity.TabletPC;

import java.util.Objects;

public class TabletPCBuilder extends ApplianceBuilder {
    private final String lineWithParameters;

    public TabletPCBuilder(final String lineWithParameters) {
        this.lineWithParameters = lineWithParameters;
    }

    @Override
    public TabletPC build() {
        String[] parameters = findParameters(lineWithParameters);
        String manufacturer = parameters[5];
        double price = Double.parseDouble(parameters[6]);
        double batteryCapacity = Double.parseDouble(parameters[0]);
        int memoryRom = Integer.parseInt(parameters[2]);
        double displayInches = Double.parseDouble(parameters[1]);
        TabletPC tabletPC = new TabletPC(manufacturer, price, batteryCapacity, memoryRom, displayInches);

        if (!Objects.requireNonNull(parameters[3]).equals("null")) {
            tabletPC.setFlashMemoryCapacity(Integer.parseInt(parameters[3]));
        }
        if (!Objects.requireNonNull(parameters[4]).equals("null")) {
            tabletPC.setColor(parameters[4]);
        }
        return tabletPC;
    }
}
