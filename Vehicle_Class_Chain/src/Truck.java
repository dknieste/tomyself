
public class Truck extends Vehicle implements Vehicle_Interface{

	public int NumberOfAxels;
	
	public Truck(){}
	
	public Truck(int NumberOfAxels){
		this.NumberOfAxels = NumberOfAxels;
	}
	public int getNumberOfAxels(){
		return NumberOfAxels;
	}
	public void setNumberOfDoors(int NumberOfAxels){
		this.NumberOfAxels = NumberOfAxels;
	}
}
