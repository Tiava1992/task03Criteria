package by.tc.task01.dao.impl.builder;

import by.tc.task01.entity.VacuumCleaner;

import java.util.Objects;

public class VacuumCleanerBuilder extends ApplianceBuilder{
    private final String lineWithParameters;

    public VacuumCleanerBuilder(final String lineWithParameters) {
        this.lineWithParameters = lineWithParameters;
    }

    @Override
    public VacuumCleaner build() {
        String[] parameters = findParameters(lineWithParameters);
        String manufacturer = parameters[9];
        double price = Double.parseDouble(parameters[10]);
        int powerConsumption = Integer.parseInt(parameters[0]);
        int weight = Integer.parseInt(parameters[1]);
        double height = Double.parseDouble(parameters[2]);
        double width = Double.parseDouble(parameters[3]);
        VacuumCleaner vacuumCleaner = new VacuumCleaner(manufacturer, price, powerConsumption, weight, height, width);

        if (!Objects.requireNonNull(parameters[4]).equals("null")) {
            vacuumCleaner.setFilterType(parameters[4]);
        }
        if (!Objects.requireNonNull(parameters[5]).equals("null")) {
            vacuumCleaner.setBagType(parameters[5]);
        }
        if (!Objects.requireNonNull(parameters[6]).equals("null")) {
            vacuumCleaner.setWandType(parameters[6]);
        }
        if (!Objects.requireNonNull(parameters[7]).equals("null")) {
            vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt(parameters[7]));
        }
        if (!Objects.requireNonNull(parameters[8]).equals("null")) {
            vacuumCleaner.setCleaningWidth(Integer.parseInt(parameters[8]));
        }
        return vacuumCleaner;
    }
}
