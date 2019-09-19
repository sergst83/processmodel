package ru.bia.model;

import org.kie.api.definition.type.Label;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Cargo implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@Label(value = "Длина")
	private float length;
	@Label(value = "Ширина")
	private float width;
	@Label(value = "Высота")
	private float height;
	@Label(value = "Вес")
	private float weight;
	@Label(value = "Тип упаковки")
	private String packageType;

	public Cargo() {
	}

	public float getLength() {
		return this.length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return this.width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getPackageType() {
		return this.packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}

	public Cargo(float length, float width, float height, float weight,
			String packageType) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.packageType = packageType;
	}

	@Override
	public String toString() {
		return "Cargo{" +
				"length=" + length +
				", width=" + width +
				", height=" + height +
				", weight=" + weight +
				", packageType='" + packageType + '\'' +
				'}';
	}
}