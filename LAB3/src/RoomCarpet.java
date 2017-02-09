public class RoomCarpet {
	private RoomDimension room;
	private double carpetCost, totalCost;
	
	public RoomCarpet(RoomDimension r, double c){
		carpetCost = c;
		room = r;
	}
	// GETTERS AND SETTERS //
	public RoomDimension getRoom() {
		return room;
	}

	public void setRoom(RoomDimension room) {
		this.room = room;
	}

	public double getCarpetCost() {
		return carpetCost;
	}

	public void setCarpetCost(double carpetCost) {
		this.carpetCost = carpetCost;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	// END OF GETTERS AND SETTERS //
	
}
