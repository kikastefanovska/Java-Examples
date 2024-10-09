package mk.iwec.predicateExample;

public class Car {
	private String manufacturer;
	private boolean automaticTransmission;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public boolean isAutomaticTransmission() {
		return automaticTransmission;
	}

	public void setAutomaticTransmission(boolean automaticTransmission) {
		this.automaticTransmission = automaticTransmission;
	}

	public Car(String manufacturer, boolean automaticTransmission) {
		super();
		this.manufacturer = manufacturer;
		this.automaticTransmission = automaticTransmission;
	}

	@Override
	public String toString() {
		return "Car [manufacturer=" + manufacturer + ", automaticTransmission=" + automaticTransmission + "]";
	}

}
