package mk.iwec.inheritance;

public class Monitor {
		private String model;
		private boolean on;
		private int width;
		private int height;
		
		
		public Monitor(String model, boolean on, int width, int height) {
			super();
			this.model = model;
			this.on = on;
			this.width = width;
			this.height = height;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public boolean isOn() {
			return on;
		}
		public void setOn(boolean on) {
			this.on = on;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
}	
	