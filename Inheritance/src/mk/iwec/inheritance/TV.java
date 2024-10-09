package mk.iwec.inheritance;

public class TV extends Monitor {
	private String colour;
	
	public TV(String colour) {
		super("LG", true,1920, 1080);
		this.colour= colour;
	}

	@Override
	public String toString() {
		return "TV [colour=" + colour + ", getModel()=" + getModel() + ", isOn()=" + isOn() + ", getWidth()="
				+ getWidth() + ", getHeight()=" + getHeight() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
		
	}

	
	

	
	

	

