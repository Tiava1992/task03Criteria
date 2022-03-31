package by.tc.task01.entity;

import java.util.Objects;

public abstract class Product {
    private String manufacturer;
    private double price;

    public Product() {
    }

    public Product(String manufacturer, double price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 && Objects.equals(getManufacturer(), product.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacturer(),getPrice());
    }
}
