
public class Car extends Vehicle implements Vehicle_Interface{
	
	public int NumberOfDoors;
	
	public Car(){}
	
	public Car(int NumberOfDoors){
		this.NumberOfDoors = NumberOfDoors;
	}
	public int getNumberOfDoors(){
		return NumberOfDoors;
	}
	public void setNumberOfDoors(int NumberOfDoors){
		this.NumberOfDoors = NumberOfDoors;
	}
}
