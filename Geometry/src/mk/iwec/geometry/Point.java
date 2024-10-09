package mk.iwec.geometry;

import java.util.Objects;

public class Point {

	private int x;
	private int y;
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// ova e napisano od nas
	//public boolean equals(Object obj) {
	//	if (obj instanceof Point) {
		//	Point p= (Point) obj;
			//if (p.x == this.x && p.y == this.y) 
			//	return true;
			//	else 
			//	return false;
		//	}
		
//return false;
	//}
	
		public String toString () {
			return "(" + x + ", " + y + ")";
		}
		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			return x == other.x && y == other.y;
		}
	
		
		
		}
						





