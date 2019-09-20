package ru.bia.process.model;

import org.kie.api.definition.type.Label;

import java.util.Arrays;
import java.util.List;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@Label(value = "uuid")
	private String id;
	@Label(value = "Заказанные продукты")
	private List<Product> products;

	public Order() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Order(String id,
                 List<Product> products) {
		this.id = id;
		this.products = products;
	}

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
				", products=" + (products != null ? Arrays.toString(products.toArray()) : Arrays.toString(new Product[]{})) +
                "}";
    }
}