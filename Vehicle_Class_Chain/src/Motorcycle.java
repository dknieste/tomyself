
public class Motorcycle extends Vehicle implements Vehicle_Interface{

	public boolean hasSideCar;
	
	public Motorcycle(){}
	
	public Motorcycle(boolean hasSideCar){
		this.hasSideCar = hasSideCar;
	}
	
	public boolean getHasSideCar(){
		return hasSideCar;
	}
	public void setHasSideCar(boolean hasSideCar){
		this.hasSideCar = hasSideCar;
	}
}
