public class RoomDimension {
	private double length, width;
	
	public RoomDimension(double l, double w){
		width  = w;
		length = l;
	}
	// GETTERS AND SETTERS //
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}	
	// END OF GETTERS AND SETTERS //
	
	public String toString(){
		return "Length: "+length+", Width: "+width;
	}
}
