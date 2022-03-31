package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Product;

import java.util.List;

public class PrintApplianceInfo {

	public static void print(List<Product> foundProductList) {
		if (!foundProductList.isEmpty()) {
			for (Product foundProduct : foundProductList) {
				System.out.println(foundProduct.toString());
			}
			System.out.println();
		} else {
			System.out.println("Data not found");
		}
	}
}
