package mk.iwec.flowcontrol;

public class Water {

	public Waterstate defineState(int temp) {
		if(temp<=0) {
			return Waterstate.ICE;
		}
		else if (temp<100) {
			return Waterstate.LIQUID;
		}
		else {
			return Waterstate.STEAM;
		}
	}
}
