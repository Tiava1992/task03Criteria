package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.builder.*;
import by.tc.task01.entity.Product;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public List<Product> find(final Criteria criteria) {
		List<Product> productList = new ArrayList<>();
		String dbPath = Objects.requireNonNull(getClass().getResource("/appliances_db.txt")).getPath();

		try (BufferedReader dbFileReader = new BufferedReader(new FileReader(dbPath))) {
			int numberOfUserCriteria = criteria.getCriteria().size();
			int foundCriteria;
			String targetClassName = criteria.getGroupSearchName();

			while (dbFileReader.ready()) {
				String lineWithObjectParameters = dbFileReader.readLine();
				foundCriteria = 0;

				if (lineWithObjectParameters.matches(targetClassName + ".+")) {
					for (Map.Entry<String, Object> criteriaMap : criteria.getCriteria().entrySet()) {
						if (findMatchesInLine(lineWithObjectParameters, criteriaMap)) {
							foundCriteria++;
						}
						if (foundCriteria == numberOfUserCriteria) {
							productList.add(createObject(lineWithObjectParameters, targetClassName));
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Cannot access file appliances_db.txt or file not found", e);
		} catch (IOException e) {
			throw new RuntimeException("Error while working with the Appliances_db.txt file", e);
		}
		return productList;
	}

	private Product createObject(final String lineWithObjectParameters, final String className) {

		switch (className) {
			case "Laptop":
				return new LaptopBuilder(lineWithObjectParameters).build();
			case "Oven":
				return new OvenBuilder(lineWithObjectParameters).build();
			case "Refrigerator":
				return new RefrigeratorBuilder(lineWithObjectParameters).build();
			case "Speakers":
				return new SpeakersBuilder(lineWithObjectParameters).build();
			case "TabletPC":
				return new TabletPCBuilder(lineWithObjectParameters).build();
			case "VacuumCleaner":
				return new VacuumCleanerBuilder(lineWithObjectParameters).build();
			default:
				throw new RuntimeException("No builder can be called to create an object of product.");
		}
	}

	private boolean findMatchesInLine(final String lineWithObjectParameters, final Map.Entry<String, Object> criteriaMap) {
		return lineWithObjectParameters.matches(".+" +
				criteriaMap.getKey() + "=" +
				criteriaMap.getValue().toString() + "(|(,.+))");
	}
}

