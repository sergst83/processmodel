package ru.bia.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Characteristic implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Адрес отправителя")
	private String addressFrom;
	@org.kie.api.definition.type.Label(value = "Адрес получателя")
	private String addressTo;
	@org.kie.api.definition.type.Label(value = "Груз")
	private ru.bia.model.Cargo cargo;

	public Characteristic() {
	}

	public String getAddressFrom() {
		return this.addressFrom;
	}

	public void setAddressFrom(String addressFrom) {
		this.addressFrom = addressFrom;
	}

	public String getAddressTo() {
		return this.addressTo;
	}

	public void setAddressTo(String addressTo) {
		this.addressTo = addressTo;
	}

	public ru.bia.model.Cargo getCargo() {
		return this.cargo;
	}

	public void setCargo(ru.bia.model.Cargo cargo) {
		this.cargo = cargo;
	}

	public Characteristic(String addressFrom,
                          String addressTo, ru.bia.model.Cargo cargo) {
		this.addressFrom = addressFrom;
		this.addressTo = addressTo;
		this.cargo = cargo;
	}

    @Override
    public String toString() {
        return "Characteristic{" +
                "addressFrom='" + addressFrom + '\'' +
                ", addressTo='" + addressTo + '\'' +
                ", cargo=" + cargo +
                '}';
    }
}